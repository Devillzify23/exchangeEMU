package com.cryptocurrencies.api.application.service.adapter;

import com.cryptocurrencies.api.domain.model.TransactionHistory;
import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.domain.model.Wallet;
import com.cryptocurrencies.api.domain.port.service.TransactionHistoryServicePort;
import com.cryptocurrencies.api.domain.repository.criptocurrencyport.CryptocurrencyRepositoryPort;
import com.cryptocurrencies.api.domain.repository.transactionhistoryprovider.TransactionHistoryRepositoryPort;

import com.cryptocurrencies.api.domain.repository.userprovider.UserRepositoryPort;
import com.cryptocurrencies.api.domain.repository.walletprovider.WalletRepositoryPort;
import com.cryptocurrencies.api.infrastructure.in.controllers.exception.TransactionError;
import com.cryptocurrencies.api.infrastructure.out.db.entities.TransactionHistoryEntity;
import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntityPK;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class TransactionHistoryServiceAdapter implements TransactionHistoryServicePort
{
    TransactionHistoryRepositoryPort transactionHistoryRepositoryPort;
    UserRepositoryPort userRepositoryPort;
    WalletRepositoryPort walletRepositoryPort;
    CryptocurrencyRepositoryPort cryptocurrencyRepositoryPort;

    @Override
    public List<TransactionHistory> getTransactionsById(Long id)
    {
        return transactionHistoryRepositoryPort.getTransactionsById(id);
    }

    @Override
    public TransactionHistory saveNewTransaction(TransactionHistory transactionHistory) throws TransactionError {//hacer toda la logica aqui
        User user = userRepositoryPort.getUserById(transactionHistory.getIdUser());
        Wallet wallet = walletRepositoryPort.getEspecificWallet(transactionHistory.getIdUser(),transactionHistory.getSymbol());
        TransactionHistory entity = null;

        if(transactionHistory.getAmount() * transactionHistory.getActualPrice() > 5) {
            if (transactionHistory.getOpType() == 'C') {
                if (user.getSaldo().doubleValue() > transactionHistory.getAmount() * transactionHistory.getActualPrice()) {
                    double saldo = (user.getSaldo().doubleValue() - transactionHistory.getAmount() * transactionHistory.getActualPrice());
                    user.setSaldo(BigDecimal.valueOf(saldo).setScale(2,RoundingMode.CEILING));
                    wallet.setFunds(wallet.getFunds() + transactionHistory.getAmount());
                    transactionHistory.setTransactionTime(LocalDateTime.now());
                    userRepositoryPort.updateUser(user);
                    walletRepositoryPort.updateWallet(wallet);
                    entity = transactionHistoryRepositoryPort.saveNewTransaction(transactionHistory);
                } else {
                    throw new TransactionError("Saldo insuficiente", null);
                }
            }
            if (transactionHistory.getOpType() == 'V') {
                if (wallet.getFunds() > transactionHistory.getAmount()) {
                    double saldo = (user.getSaldo().doubleValue() + transactionHistory.getActualPrice() * transactionHistory.getAmount());
                    user.setSaldo(BigDecimal.valueOf(saldo).setScale(2, RoundingMode.CEILING));
                    wallet.setFunds(wallet.getFunds() - transactionHistory.getAmount());
                    transactionHistory.setTransactionTime(LocalDateTime.now());
                    userRepositoryPort.updateUser(user);
                    walletRepositoryPort.updateWallet(wallet);
                    entity = transactionHistoryRepositoryPort.saveNewTransaction(transactionHistory);
                } else {
                    throw new TransactionError("Saldo insuficiente", null);
                }
            }
        }
        else{
            throw new TransactionError("Cantidad insuficiente", null);
        }
        return entity;
    }
}
