package com.ub.paritycollector.domain.enumeration;

import com.ub.paritycollector.service.parity.ParityCollector;
import com.ub.paritycollector.service.parity.impl.BinanceParityCollector;
import com.ub.paritycollector.service.parity.impl.BtcTurkParityCollector;

public enum ParitySymbol {

    /*
     * Binance Parity Collector
     */
    ETHBTC(BinanceParityCollector.class),
    LTCBTC(BinanceParityCollector.class),
    BNBBTC(BinanceParityCollector.class),
    NEOBTC(BinanceParityCollector.class),
    QTUMETH(BinanceParityCollector.class),
    EOSETH(BinanceParityCollector.class),
    SNTETH(BinanceParityCollector.class),
    BNTETH(BinanceParityCollector.class),
    BCCBTC(BinanceParityCollector.class),
    GASBTC(BinanceParityCollector.class),
    BNBETH(BinanceParityCollector.class),
    BTCUSDT(BinanceParityCollector.class),
    ETHUSDT(BinanceParityCollector.class),
    HSRBTC(BinanceParityCollector.class),
    OAXETH(BinanceParityCollector.class),
    DNTETH(BinanceParityCollector.class),
    MCOETH(BinanceParityCollector.class),
    ICNETH(BinanceParityCollector.class),
    MCOBTC(BinanceParityCollector.class),
    WTCBTC(BinanceParityCollector.class),
    WTCETH(BinanceParityCollector.class),
    LRCBTC(BinanceParityCollector.class),
    LRCETH(BinanceParityCollector.class),
    QTUMBTC(BinanceParityCollector.class),
    YOYOBTC(BinanceParityCollector.class),
    OMGBTC(BinanceParityCollector.class),
    OMGETH(BinanceParityCollector.class),
    ZRXBTC(BinanceParityCollector.class),
    ZRXETH(BinanceParityCollector.class),
    STRATBTC(BinanceParityCollector.class),
    STRATETH(BinanceParityCollector.class),
    SNGLSBTC(BinanceParityCollector.class),
    SNGLSETH(BinanceParityCollector.class),
    BQXBTC(BinanceParityCollector.class),
    BQXETH(BinanceParityCollector.class),
    KNCBTC(BinanceParityCollector.class),
    KNCETH(BinanceParityCollector.class),
    FUNBTC(BinanceParityCollector.class),
    FUNETH(BinanceParityCollector.class),
    SNMBTC(BinanceParityCollector.class),
    SNMETH(BinanceParityCollector.class),
    NEOETH(BinanceParityCollector.class),
    IOTABTC(BinanceParityCollector.class),
    IOTAETH(BinanceParityCollector.class),
    LINKBTC(BinanceParityCollector.class),
    LINKETH(BinanceParityCollector.class),
    XVGBTC(BinanceParityCollector.class),
    XVGETH(BinanceParityCollector.class),
    SALTBTC(BinanceParityCollector.class),
    SALTETH(BinanceParityCollector.class),
    MDABTC(BinanceParityCollector.class),
    MDAETH(BinanceParityCollector.class),
    MTLBTC(BinanceParityCollector.class),
    MTLETH(BinanceParityCollector.class),
    SUBBTC(BinanceParityCollector.class),
    SUBETH(BinanceParityCollector.class),
    EOSBTC(BinanceParityCollector.class),
    SNTBTC(BinanceParityCollector.class),
    ETCETH(BinanceParityCollector.class),
    ETCBTC(BinanceParityCollector.class),
    MTHBTC(BinanceParityCollector.class),
    MTHETH(BinanceParityCollector.class),
    ENGBTC(BinanceParityCollector.class),
    ENGETH(BinanceParityCollector.class),
    DNTBTC(BinanceParityCollector.class),
    ZECBTC(BinanceParityCollector.class),
    ZECETH(BinanceParityCollector.class),
    BNTBTC(BinanceParityCollector.class),
    ASTBTC(BinanceParityCollector.class),
    ASTETH(BinanceParityCollector.class),
    DASHBTC(BinanceParityCollector.class),
    DASHETH(BinanceParityCollector.class),
    OAXBTC(BinanceParityCollector.class),
    ICNBTC(BinanceParityCollector.class),
    BTGBTC(BinanceParityCollector.class),
    BTGETH(BinanceParityCollector.class),
    EVXBTC(BinanceParityCollector.class),
    EVXETH(BinanceParityCollector.class),
    REQBTC(BinanceParityCollector.class),
    REQETH(BinanceParityCollector.class),
    VIBBTC(BinanceParityCollector.class),
    VIBETH(BinanceParityCollector.class),
    HSRETH(BinanceParityCollector.class),
    TRXBTC(BinanceParityCollector.class),
    TRXETH(BinanceParityCollector.class),
    POWRBTC(BinanceParityCollector.class),
    POWRETH(BinanceParityCollector.class),
    ARKBTC(BinanceParityCollector.class),
    ARKETH(BinanceParityCollector.class),
    YOYOETH(BinanceParityCollector.class),
    XRPBTC(BinanceParityCollector.class),
    XRPETH(BinanceParityCollector.class),
    MODBTC(BinanceParityCollector.class),
    MODETH(BinanceParityCollector.class),
    ENJBTC(BinanceParityCollector.class),
    ENJETH(BinanceParityCollector.class),
    STORJBTC(BinanceParityCollector.class),
    STORJETH(BinanceParityCollector.class),
    BNBUSDT(BinanceParityCollector.class),
    VENBNB(BinanceParityCollector.class),
    YOYOBNB(BinanceParityCollector.class),
    POWRBNB(BinanceParityCollector.class),
    VENBTC(BinanceParityCollector.class),
    VENETH(BinanceParityCollector.class),
    KMDBTC(BinanceParityCollector.class),
    KMDETH(BinanceParityCollector.class),
    NULSBNB(BinanceParityCollector.class),
    RCNBTC(BinanceParityCollector.class),
    RCNETH(BinanceParityCollector.class),
    RCNBNB(BinanceParityCollector.class),
    NULSBTC(BinanceParityCollector.class),
    NULSETH(BinanceParityCollector.class),
    RDNBTC(BinanceParityCollector.class),
    RDNETH(BinanceParityCollector.class),
    RDNBNB(BinanceParityCollector.class),
    XMRBTC(BinanceParityCollector.class),
    XMRETH(BinanceParityCollector.class),
    DLTBNB(BinanceParityCollector.class),
    WTCBNB(BinanceParityCollector.class),
    DLTBTC(BinanceParityCollector.class),
    DLTETH(BinanceParityCollector.class),
    AMBBTC(BinanceParityCollector.class),
    AMBETH(BinanceParityCollector.class),
    AMBBNB(BinanceParityCollector.class),
    BCCETH(BinanceParityCollector.class),
    BCCUSDT(BinanceParityCollector.class),
    BCCBNB(BinanceParityCollector.class),
    BATBTC(BinanceParityCollector.class),
    BATETH(BinanceParityCollector.class),
    BATBNB(BinanceParityCollector.class),
    BCPTBTC(BinanceParityCollector.class),
    BCPTETH(BinanceParityCollector.class),
    BCPTBNB(BinanceParityCollector.class),
    ARNBTC(BinanceParityCollector.class),
    ARNETH(BinanceParityCollector.class),
    GVTBTC(BinanceParityCollector.class),
    GVTETH(BinanceParityCollector.class),
    CDTBTC(BinanceParityCollector.class),
    CDTETH(BinanceParityCollector.class),
    GXSBTC(BinanceParityCollector.class),
    GXSETH(BinanceParityCollector.class),
    NEOUSDT(BinanceParityCollector.class),
    NEOBNB(BinanceParityCollector.class),
    POEBTC(BinanceParityCollector.class),
    POEETH(BinanceParityCollector.class),
    QSPBTC(BinanceParityCollector.class),
    QSPETH(BinanceParityCollector.class),
    QSPBNB(BinanceParityCollector.class),
    BTSBTC(BinanceParityCollector.class),
    BTSETH(BinanceParityCollector.class),
    BTSBNB(BinanceParityCollector.class),
    XZCBTC(BinanceParityCollector.class),
    XZCETH(BinanceParityCollector.class),
    XZCBNB(BinanceParityCollector.class),
    LSKBTC(BinanceParityCollector.class),
    LSKETH(BinanceParityCollector.class),
    LSKBNB(BinanceParityCollector.class),
    TNTBTC(BinanceParityCollector.class),
    TNTETH(BinanceParityCollector.class),
    FUELBTC(BinanceParityCollector.class),
    FUELETH(BinanceParityCollector.class),
    MANABTC(BinanceParityCollector.class),
    MANAETH(BinanceParityCollector.class),
    BCDBTC(BinanceParityCollector.class),
    BCDETH(BinanceParityCollector.class),
    DGDBTC(BinanceParityCollector.class),
    DGDETH(BinanceParityCollector.class),
    IOTABNB(BinanceParityCollector.class),
    ADXBTC(BinanceParityCollector.class),
    ADXETH(BinanceParityCollector.class),
    ADXBNB(BinanceParityCollector.class),
    ADABTC(BinanceParityCollector.class),
    ADAETH(BinanceParityCollector.class),
    PPTBTC(BinanceParityCollector.class),
    PPTETH(BinanceParityCollector.class),
    CMTBTC(BinanceParityCollector.class),
    CMTETH(BinanceParityCollector.class),
    CMTBNB(BinanceParityCollector.class),
    XLMBTC(BinanceParityCollector.class),
    XLMETH(BinanceParityCollector.class),
    XLMBNB(BinanceParityCollector.class),
    CNDBTC(BinanceParityCollector.class),
    CNDETH(BinanceParityCollector.class),
    CNDBNB(BinanceParityCollector.class),
    LENDBTC(BinanceParityCollector.class),
    LENDETH(BinanceParityCollector.class),
    WABIBTC(BinanceParityCollector.class),
    WABIETH(BinanceParityCollector.class),
    WABIBNB(BinanceParityCollector.class),
    LTCETH(BinanceParityCollector.class),
    LTCUSDT(BinanceParityCollector.class),
    LTCBNB(BinanceParityCollector.class),
    TNBBTC(BinanceParityCollector.class),
    TNBETH(BinanceParityCollector.class),
    WAVESBTC(BinanceParityCollector.class),
    WAVESETH(BinanceParityCollector.class),
    WAVESBNB(BinanceParityCollector.class),
    GTOBTC(BinanceParityCollector.class),
    GTOETH(BinanceParityCollector.class),
    GTOBNB(BinanceParityCollector.class),
    ICXBTC(BinanceParityCollector.class),
    ICXETH(BinanceParityCollector.class),
    ICXBNB(BinanceParityCollector.class),
    OSTBTC(BinanceParityCollector.class),
    OSTETH(BinanceParityCollector.class),
    OSTBNB(BinanceParityCollector.class),
    ELFBTC(BinanceParityCollector.class),
    ELFETH(BinanceParityCollector.class),
    AIONBTC(BinanceParityCollector.class),
    AIONETH(BinanceParityCollector.class),
    AIONBNB(BinanceParityCollector.class),
    NEBLBTC(BinanceParityCollector.class),
    NEBLETH(BinanceParityCollector.class),
    NEBLBNB(BinanceParityCollector.class),
    BRDBTC(BinanceParityCollector.class),
    BRDETH(BinanceParityCollector.class),
    BRDBNB(BinanceParityCollector.class),
    MCOBNB(BinanceParityCollector.class),
    EDOBTC(BinanceParityCollector.class),
    EDOETH(BinanceParityCollector.class),
    WINGSBTC(BinanceParityCollector.class),
    WINGSETH(BinanceParityCollector.class),
    NAVBTC(BinanceParityCollector.class),
    NAVETH(BinanceParityCollector.class),
    NAVBNB(BinanceParityCollector.class),
    LUNBTC(BinanceParityCollector.class),
    LUNETH(BinanceParityCollector.class),
    TRIGBTC(BinanceParityCollector.class),
    TRIGETH(BinanceParityCollector.class),
    TRIGBNB(BinanceParityCollector.class),
    APPCBTC(BinanceParityCollector.class),
    APPCETH(BinanceParityCollector.class),
    APPCBNB(BinanceParityCollector.class),
    VIBEBTC(BinanceParityCollector.class),
    VIBEETH(BinanceParityCollector.class),
    RLCBTC(BinanceParityCollector.class),
    RLCETH(BinanceParityCollector.class),
    RLCBNB(BinanceParityCollector.class),
    INSBTC(BinanceParityCollector.class),
    INSETH(BinanceParityCollector.class),
    PIVXBTC(BinanceParityCollector.class),
    PIVXETH(BinanceParityCollector.class),
    PIVXBNB(BinanceParityCollector.class),
    IOSTBTC(BinanceParityCollector.class),
    IOSTETH(BinanceParityCollector.class),
    CHATBTC(BinanceParityCollector.class),
    CHATETH(BinanceParityCollector.class),
    STEEMBTC(BinanceParityCollector.class),
    STEEMETH(BinanceParityCollector.class),
    STEEMBNB(BinanceParityCollector.class),
    NANOBTC(BinanceParityCollector.class),
    NANOETH(BinanceParityCollector.class),
    NANOBNB(BinanceParityCollector.class),
    VIABTC(BinanceParityCollector.class),
    VIAETH(BinanceParityCollector.class),
    VIABNB(BinanceParityCollector.class),
    BLZBTC(BinanceParityCollector.class),
    BLZETH(BinanceParityCollector.class),
    BLZBNB(BinanceParityCollector.class),
    AEBTC(BinanceParityCollector.class),
    AEETH(BinanceParityCollector.class),
    AEBNB(BinanceParityCollector.class),
    RPXBTC(BinanceParityCollector.class),
    RPXETH(BinanceParityCollector.class),
    RPXBNB(BinanceParityCollector.class),
    NCASHBTC(BinanceParityCollector.class),
    NCASHETH(BinanceParityCollector.class),
    NCASHBNB(BinanceParityCollector.class),
    POABTC(BinanceParityCollector.class),
    POAETH(BinanceParityCollector.class),
    POABNB(BinanceParityCollector.class),
    ZILBTC(BinanceParityCollector.class),
    ZILETH(BinanceParityCollector.class),
    ZILBNB(BinanceParityCollector.class),
    ONTBTC(BinanceParityCollector.class),
    ONTETH(BinanceParityCollector.class),
    ONTBNB(BinanceParityCollector.class),
    STORMBTC(BinanceParityCollector.class),
    STORMETH(BinanceParityCollector.class),
    STORMBNB(BinanceParityCollector.class),
    QTUMBNB(BinanceParityCollector.class),
    QTUMUSDT(BinanceParityCollector.class),
    XEMBTC(BinanceParityCollector.class),
    XEMETH(BinanceParityCollector.class),
    XEMBNB(BinanceParityCollector.class),
    WANBTC(BinanceParityCollector.class),
    WANETH(BinanceParityCollector.class),
    WANBNB(BinanceParityCollector.class),
    WPRBTC(BinanceParityCollector.class),
    WPRETH(BinanceParityCollector.class),
    QLCBTC(BinanceParityCollector.class),
    QLCETH(BinanceParityCollector.class),
    SYSBTC(BinanceParityCollector.class),
    SYSETH(BinanceParityCollector.class),
    SYSBNB(BinanceParityCollector.class),
    QLCBNB(BinanceParityCollector.class),
    GRSBTC(BinanceParityCollector.class),
    GRSETH(BinanceParityCollector.class),
    ADAUSDT(BinanceParityCollector.class),
    ADABNB(BinanceParityCollector.class),
    CLOAKBTC(BinanceParityCollector.class),
    CLOAKETH(BinanceParityCollector.class),
    GNTBTC(BinanceParityCollector.class),
    GNTETH(BinanceParityCollector.class),
    GNTBNB(BinanceParityCollector.class),
    LOOMBTC(BinanceParityCollector.class),
    LOOMETH(BinanceParityCollector.class),
    LOOMBNB(BinanceParityCollector.class),
    XRPUSDT(BinanceParityCollector.class),
    BCNBTC(BinanceParityCollector.class),
    BCNETH(BinanceParityCollector.class),
    BCNBNB(BinanceParityCollector.class),
    REPBTC(BinanceParityCollector.class),
    REPETH(BinanceParityCollector.class),
    REPBNB(BinanceParityCollector.class),
    TUSDBTC(BinanceParityCollector.class),
    TUSDETH(BinanceParityCollector.class),
    TUSDBNB(BinanceParityCollector.class),
    ZENBTC(BinanceParityCollector.class),
    ZENETH(BinanceParityCollector.class),
    ZENBNB(BinanceParityCollector.class),
    SKYBTC(BinanceParityCollector.class),
    SKYETH(BinanceParityCollector.class),
    SKYBNB(BinanceParityCollector.class),
    EOSUSDT(BinanceParityCollector.class),
    EOSBNB(BinanceParityCollector.class),
    CVCBTC(BinanceParityCollector.class),
    CVCETH(BinanceParityCollector.class),
    CVCBNB(BinanceParityCollector.class),
    THETABTC(BinanceParityCollector.class),
    THETAETH(BinanceParityCollector.class),
    THETABNB(BinanceParityCollector.class),
    XRPBNB(BinanceParityCollector.class),
    TUSDUSDT(BinanceParityCollector.class),
    IOTAUSDT(BinanceParityCollector.class),
    XLMUSDT(BinanceParityCollector.class),
    IOTXBTC(BinanceParityCollector.class),
    IOTXETH(BinanceParityCollector.class),
    QKCBTC(BinanceParityCollector.class),
    QKCETH(BinanceParityCollector.class),
    AGIBTC(BinanceParityCollector.class),
    AGIETH(BinanceParityCollector.class),
    AGIBNB(BinanceParityCollector.class),
    NXSBTC(BinanceParityCollector.class),
    NXSETH(BinanceParityCollector.class),
    NXSBNB(BinanceParityCollector.class),
    ENJBNB(BinanceParityCollector.class),
    DATABTC(BinanceParityCollector.class),
    DATAETH(BinanceParityCollector.class),
    ONTUSDT(BinanceParityCollector.class),
    TRXBNB(BinanceParityCollector.class),
    TRXUSDT(BinanceParityCollector.class),
    ETCUSDT(BinanceParityCollector.class),
    ETCBNB(BinanceParityCollector.class),
    ICXUSDT(BinanceParityCollector.class),
    SCBTC(BinanceParityCollector.class),
    SCETH(BinanceParityCollector.class),
    SCBNB(BinanceParityCollector.class),
    NPXSBTC(BinanceParityCollector.class),
    NPXSETH(BinanceParityCollector.class),
    VENUSDT(BinanceParityCollector.class),
    KEYBTC(BinanceParityCollector.class),
    KEYETH(BinanceParityCollector.class),
    NASBTC(BinanceParityCollector.class),
    NASETH(BinanceParityCollector.class),
    NASBNB(BinanceParityCollector.class),
    MFTBTC(BinanceParityCollector.class),
    MFTETH(BinanceParityCollector.class),
    MFTBNB(BinanceParityCollector.class),
    DENTBTC(BinanceParityCollector.class),
    DENTETH(BinanceParityCollector.class),
    ARDRBTC(BinanceParityCollector.class),
    ARDRETH(BinanceParityCollector.class),
    ARDRBNB(BinanceParityCollector.class),
    NULSUSDT(BinanceParityCollector.class),
    HOTBTC(BinanceParityCollector.class),
    HOTETH(BinanceParityCollector.class),
    VETBTC(BinanceParityCollector.class),
    VETETH(BinanceParityCollector.class),
    VETUSDT(BinanceParityCollector.class),
    VETBNB(BinanceParityCollector.class),
    DOCKBTC(BinanceParityCollector.class),
    DOCKETH(BinanceParityCollector.class),
    POLYBTC(BinanceParityCollector.class),
    POLYBNB(BinanceParityCollector.class),
    PHXBTC(BinanceParityCollector.class),
    PHXETH(BinanceParityCollector.class),
    PHXBNB(BinanceParityCollector.class),
    HCBTC(BinanceParityCollector.class),
    HCETH(BinanceParityCollector.class),
    GOBTC(BinanceParityCollector.class),
    GOBNB(BinanceParityCollector.class),
    PAXBTC(BinanceParityCollector.class),
    PAXBNB(BinanceParityCollector.class),
    PAXUSDT(BinanceParityCollector.class),
    PAXETH(BinanceParityCollector.class),
    RVNBTC(BinanceParityCollector.class),
    RVNBNB(BinanceParityCollector.class),
    DCRBTC(BinanceParityCollector.class),
    DCRBNB(BinanceParityCollector.class),
    USDCBNB(BinanceParityCollector.class),
    USDCBTC(BinanceParityCollector.class),
    MITHBTC(BinanceParityCollector.class),
    MITHBNB(BinanceParityCollector.class),
    BCHABCBTC(BinanceParityCollector.class),
    BCHSVBTC(BinanceParityCollector.class),
    BCHABCUSDT(BinanceParityCollector.class),
    BCHSVUSDT(BinanceParityCollector.class),
    BNBPAX(BinanceParityCollector.class),
    BTCPAX(BinanceParityCollector.class),
    ETHPAX(BinanceParityCollector.class),
    XRPPAX(BinanceParityCollector.class),
    EOSPAX(BinanceParityCollector.class),
    XLMPAX(BinanceParityCollector.class),
    RENBTC(BinanceParityCollector.class),
    RENBNB(BinanceParityCollector.class),
    XRPTUSD(BinanceParityCollector.class),
    EOSTUSD(BinanceParityCollector.class),
    XLMTUSD(BinanceParityCollector.class),

    /*
     * BTC Turk Parity Collector
     */
    BTCTRY(BtcTurkParityCollector.class),
    ETHTRY(BtcTurkParityCollector.class),
    XRPTRY(BtcTurkParityCollector.class),
    LTCTRY(BtcTurkParityCollector.class),
    USDTTRY(BtcTurkParityCollector.class),
    XLMTRY(BtcTurkParityCollector.class);

    private Class<? extends ParityCollector> parityCollectorClass;

    ParitySymbol(Class<? extends ParityCollector> parityCollectorClass) {
        this.parityCollectorClass = parityCollectorClass;
    }

    public Class<? extends ParityCollector> getParityCollectorClass() {
        return parityCollectorClass;
    }
}
