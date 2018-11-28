package com.ub.paritycollector.service.parity.impl;

import com.ub.paritycollector.domain.Parity;
import com.ub.paritycollector.domain.enumeration.ParitySymbol;
import com.ub.paritycollector.service.parity.ParityCollector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractParityCollector implements ParityCollector {

    private final Logger log = LoggerFactory.getLogger(AbstractParityCollector.class);
    private final Map<Class<? extends ParityCollector>, LocalDateTime> parityCollectorUpdateTime = new HashMap<>();
    private final Map<ParitySymbol, Parity> parities = new HashMap<>();
    private final Integer timeToRenewInSeconds = 10;

    /**
     * Template Method
     */
    public final Parity getParity(ParitySymbol paritySymbol) {
        log.info("Getting Cached Parity of {}", paritySymbol);

        if (!parities.containsKey(paritySymbol)
                || !parityCollectorUpdateTime.containsKey(paritySymbol.getParityCollectorClass())
                || parityCollectorUpdateTime.get(paritySymbol.getParityCollectorClass()).plusSeconds(timeToRenewInSeconds).isBefore(LocalDateTime.now())) {

            this.updateParities(paritySymbol.getParityCollectorClass());

        }

        Parity parity = parities.get(paritySymbol);

        log.info("Return Parity {}", parity);

        return parity;
    }

    private void updateParities(Class<? extends ParityCollector> parityCollectorClass) {
        log.info("Renew Parity Collector of {}", parityCollectorClass.getName());

        this.getParityPrices().forEach((_paritySymbol, price) -> parities.put(_paritySymbol, new Parity.Builder().paritySymbol(_paritySymbol).price(price).build()));

        LocalDateTime now = LocalDateTime.now();
        parityCollectorUpdateTime.put(parityCollectorClass, now);

        log.info("Parity Collector of {} is renewed at {}", parityCollectorClass.getName(), now);
    }

}
