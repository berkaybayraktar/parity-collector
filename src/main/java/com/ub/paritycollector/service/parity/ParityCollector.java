package com.ub.paritycollector.service.parity;

import com.ub.paritycollector.domain.Parity;
import com.ub.paritycollector.domain.enumeration.ParitySymbol;

import java.math.BigDecimal;
import java.util.Map;

public interface ParityCollector {

    Parity getParity(ParitySymbol paritySymbol);

    Map<ParitySymbol, BigDecimal> getParityPrices();

}
