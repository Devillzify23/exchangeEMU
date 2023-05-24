package com.cryptocurrencies.api.application.service.adapter;

import com.cryptocurrencies.api.domain.model.Cryptocurrency;
import com.cryptocurrencies.api.domain.port.service.PricingServicePort;
import com.cryptocurrencies.api.domain.repository.memory.CryptocurrenciesMemoryPersistence;
import com.cryptocurrencies.api.domain.repository.port.CryptocurrencyRepositoryPort;
import com.cryptocurrencies.api.domain.repository.priceprovider.PriceProviderPort;
import com.cryptocurrencies.api.infrastructure.in.controllers.models.responses.CryptocurrencyDto;
import com.cryptocurrencies.api.infrastructure.out.db.mapper.CryptoCurrencyToCryptoCurrencyDtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingServiceAdapter implements PricingServicePort {

    private final CryptocurrencyRepositoryPort repository;
    private final PriceProviderPort priceProvider;
    private final CryptoCurrencyToCryptoCurrencyDtoMapper cryptoCurrencyToCryptoCurrencyDtoMapper;
    private final String EUR_CURRENCY = "EUR";

    public PricingServiceAdapter(CryptocurrencyRepositoryPort repository, PriceProviderPort priceProvider, CryptoCurrencyToCryptoCurrencyDtoMapper cryptoCurrencyToCryptoCurrencyDtoMapper) {
        this.repository = repository;
        this.priceProvider = priceProvider;
        this.cryptoCurrencyToCryptoCurrencyDtoMapper = cryptoCurrencyToCryptoCurrencyDtoMapper;
    }

    @Override
    public List<Cryptocurrency> getCurrentPricingList() {
        List<Cryptocurrency> result = CryptocurrenciesMemoryPersistence.getAvailableCryptocurrencies();
        return priceProvider.getCurrentCryptoPrices(result, EUR_CURRENCY);
    }

    @Override
    public CryptocurrencyDto getCryptoFull(String crypto) {
        List<Cryptocurrency> cryptos = getCurrentPricingList();
        Cryptocurrency fullCrypto = new Cryptocurrency();

        for (Cryptocurrency cryptoCurrency : cryptos) {
            if (cryptoCurrency.getSymbol().equals(crypto)) {
                fullCrypto = cryptoCurrency;
            }
        }
        return cryptoCurrencyToCryptoCurrencyDtoMapper.cryptoToCryptoDto(fullCrypto);
    }
}
