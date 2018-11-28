package com.ub.paritycollector.service.parity.impl;

import com.ub.paritycollector.domain.enumeration.ParitySymbol;
import com.ub.paritycollector.service.rest.RestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class BinanceParityCollector extends AbstractParityCollector {

    /**
     * Singleton
     */
    private static final BinanceParityCollector INSTANCE = new BinanceParityCollector();
    private final Logger log = LoggerFactory.getLogger(BinanceParityCollector.class);
    private ParameterizedTypeReference<Map<String, String>> responseType = new ParameterizedTypeReference<Map<String, String>>() {
    };

    private BinanceParityCollector() {

    }

    public static BinanceParityCollector getInstance() {
        return INSTANCE;
    }

    @Override
    public Map<ParitySymbol, BigDecimal> getParityPrices() {
        log.info("Loading Parity Prices from Binance API.");

        Map<ParitySymbol, BigDecimal> result = new HashMap<>();

        RestTemplate restTemplate = RestService.getInstance().getRestTemplate();

        Stream.of(ParitySymbol.values())
                .filter(paritySymbol -> paritySymbol.getParityCollectorClass() == BinanceParityCollector.class)
                .forEach(paritySymbol -> {

                    try {
                        ResponseEntity<Map<String, String>> response = restTemplate.exchange(RequestEntity.get(new URI("https://api.binance.com/api/v1/ticker/24hr?symbol=" + paritySymbol.name())).accept(MediaType.APPLICATION_JSON).build(), responseType);

                        if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
                            result.put(paritySymbol, new BigDecimal(response.getBody().get("lastPrice")));
                        }

                    } catch (URISyntaxException ignored) {
                    }
                });

        log.info("Parity Prices from Binance API are loaded, {}", result);

        return result;
    }
}
