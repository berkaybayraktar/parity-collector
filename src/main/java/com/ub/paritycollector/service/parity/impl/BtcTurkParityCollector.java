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
import java.util.List;
import java.util.Map;

public class BtcTurkParityCollector extends AbstractParityCollector {

    /**
     * Singleton
     */
    private static final BtcTurkParityCollector INSTANCE = new BtcTurkParityCollector();
    private final Logger log = LoggerFactory.getLogger(BtcTurkParityCollector.class);
    private ParameterizedTypeReference<List<Map<String, String>>> responseType = new ParameterizedTypeReference<List<Map<String, String>>>() {
    };

    private BtcTurkParityCollector() {

    }

    public static BtcTurkParityCollector getInstance() {
        return INSTANCE;
    }

    @Override
    public Map<ParitySymbol, BigDecimal> getParityPrices() {
        log.info("Loading Parity Prices from BTCTurk API.");
        Map<ParitySymbol, BigDecimal> result = new HashMap<>();

        RestTemplate restTemplate = RestService.getInstance().getRestTemplate();

        try {
            ResponseEntity<List<Map<String, String>>> response = restTemplate.exchange(RequestEntity.get(new URI("https://www.btcturk.com/api/ticker")).accept(MediaType.APPLICATION_JSON).header("User-Agent", "Mozilla/5.0").build(), responseType);

            if (response.getStatusCode() != HttpStatus.OK || response.getBody() == null) {
                return null;
            }

            response.getBody().forEach(pairMap -> {
                try {

                    ParitySymbol paritySymbol = ParitySymbol.valueOf(pairMap.get("pair"));

                    if (paritySymbol.getParityCollectorClass().equals(BtcTurkParityCollector.class)) {
                        result.put(paritySymbol, new BigDecimal(pairMap.get("last")));
                    }
                } catch (Exception ignored) {
                }
            });

        } catch (URISyntaxException ignored) {
        }

        log.info("Parity Prices from BTCTurk API are loaded, {}", result);

        return result;
    }
}
