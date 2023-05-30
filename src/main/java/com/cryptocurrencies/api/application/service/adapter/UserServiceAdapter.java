package com.cryptocurrencies.api.application.service.adapter;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.model.User;
import com.cryptocurrencies.api.domain.port.service.UserServicePort;
import com.cryptocurrencies.api.domain.repository.memory.CryptocurrenciesMemoryPersistence;
import com.cryptocurrencies.api.domain.repository.userprovider.UserRepositoryPort;
import com.cryptocurrencies.api.domain.repository.walletprovider.WalletRepositoryPort;
import com.cryptocurrencies.api.infrastructure.out.db.entities.WalletEntityPK;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceAdapter implements UserServicePort
{
    private final UserRepositoryPort userRepository;
    private final WalletRepositoryPort walletRepositoryPort;

    public UserServiceAdapter(UserRepositoryPort userRepository, WalletRepositoryPort walletRepositoryPort){
        this.userRepository = userRepository;
        this.walletRepositoryPort = walletRepositoryPort;
    }

    @Override
    public User getActualUser(String cuenta, String password)
    {
        return userRepository.getActualUser(cuenta, password);
    }

    @Override
    public User registerUser(User user)
    {
        User newUser = userRepository.registerUser(user, 50000.0);
        List<Cryptocurrency> cryptos = CryptocurrenciesMemoryPersistence.getAvailableCryptocurrencies();
        for(Cryptocurrency c : cryptos)
        {
            walletRepositoryPort.createNewWallet(newUser.getId(), c.getSymbol());
        }
        return newUser;
    }
}
