package com.cryptocurrencies.api.infrastructure.out.binance;

import com.cryptocurrencies.api.domain.model.Pricing;
import com.cryptocurrencies.api.infrastructure.out.binance.models.responses.Binance24hr;
import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.repository.priceprovider.PriceProviderPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BinancePriceProviderAdapter implements PriceProviderPort {

    private final BinanceCryptoApiRequest binanceCryptoApiRequest;
    @Override
    public List<Cryptocurrency> getCurrentCryptoPrices(List<Cryptocurrency> cryptos, String currency) {
        String symbolList = cryptos.stream().map(it -> "\"" + it.getSymbol() + currency + "\"").collect(Collectors.joining(",","[","]"));
        List<Binance24hr> binance24hrs = binanceCryptoApiRequest.getFullCryptos(symbolList);
        for(Cryptocurrency crypto : cryptos)
        {
            for(Binance24hr binanceCrypto : binance24hrs)
            {
                if(crypto.getSymbol().equals(binanceCrypto.getSymbol()))
                {
                    //todo acabar el metodo este
                }
            }
        }


        return cryptos;
    }
}
