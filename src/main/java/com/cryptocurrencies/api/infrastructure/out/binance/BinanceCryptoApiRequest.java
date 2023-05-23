package com.cryptocurrencies.api.infrastructure.out.binance;

import com.cryptocurrencies.api.infrastructure.out.binance.models.responses.Binance24hr;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "BINANCE-REQUEST", url = "https://api.binance.com/api/v3",configuration = FeignClientConfig.class)
public interface BinanceCryptoApiRequest
{
    @GetMapping(value = "/ticker/24hr", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<Binance24hr> getFullCryptos(@RequestParam("symbols") String cryptoSymbols);
}
