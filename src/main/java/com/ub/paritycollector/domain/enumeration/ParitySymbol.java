package com.ub.paritycollector.domain.enumeration;

import com.ub.paritycollector.service.parity.ParityCollector;
import com.ub.paritycollector.service.parity.impl.BinanceParityCollector;
import com.ub.paritycollector.service.parity.impl.BtcTurkParityCollector;

public enum ParitySymbol {

    /*
     * Binance Parity Collector
     */
    XRPBTC(BinanceParityCollector.class),

    /*
     * BTC Turk Parity Collector
     */
    BTCTRY(BtcTurkParityCollector.class),
    ETHTRY(BtcTurkParityCollector.class),
    XRPTRY(BtcTurkParityCollector.class),
    LTCTRY(BtcTurkParityCollector.class),
    USDTTRY(BtcTurkParityCollector.class),
    BTCUSDT(BtcTurkParityCollector.class),
    XLMTRY(BtcTurkParityCollector.class);

    private Class<? extends ParityCollector> parityCollectorClass;

    ParitySymbol(Class<? extends ParityCollector> parityCollectorClass) {
        this.parityCollectorClass = parityCollectorClass;
    }

    public Class<? extends ParityCollector> getParityCollectorClass() {
        return parityCollectorClass;
    }
}
