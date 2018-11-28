package com.ub.paritycollector.service.parity;

import com.ub.paritycollector.domain.Parity;
import com.ub.paritycollector.domain.enumeration.ParitySymbol;

import java.util.ArrayList;
import java.util.List;

public class ParityService {

    /**
     * Singleton
     */
    private static final ParityService INSTANCE = new ParityService();

    private ParityService() {

    }

    public static ParityService getInstance() {
        return INSTANCE;
    }

    public List<Parity> getParities() {
        List<Parity> parities = new ArrayList<>();

        for (ParitySymbol paritySymbol : ParitySymbol.values()) {
            parities.add(this.getParity(paritySymbol));
        }

        return parities;
    }

    public Parity getParity(ParitySymbol paritySymbol) {

        ParityCollector parityCollector = ParityCollectorFactory.getInstanceOf(paritySymbol.getParityCollectorClass());

        return parityCollector.getParity(paritySymbol);
    }

}
