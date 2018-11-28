package com.ub.paritycollector.service.parity;

import com.ub.paritycollector.service.parity.impl.BinanceParityCollector;
import com.ub.paritycollector.service.parity.impl.BtcTurkParityCollector;

/**
 * Factory Method
 */
class ParityCollectorFactory {

    static ParityCollector getInstanceOf(Class<? extends ParityCollector> parityCollectorClass) {

        if (parityCollectorClass == BinanceParityCollector.class) {
            return BinanceParityCollector.getInstance();
        } else if (parityCollectorClass == BtcTurkParityCollector.class) {
            return BtcTurkParityCollector.getInstance();
        } else {
            throw new UnsupportedOperationException();
        }

    }

}
