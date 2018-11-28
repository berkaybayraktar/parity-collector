package com.ub.paritycollector.domain;

import com.ub.paritycollector.domain.enumeration.ParitySymbol;

import java.math.BigDecimal;

public class Parity {

    private ParitySymbol paritySymbol;

    private BigDecimal price;

    /**
     * Builder
     */
    private Parity(Builder builder) {
        this.paritySymbol = builder.paritySymbol;
        this.price = builder.price;
    }

    public ParitySymbol getParitySymbol() {
        return paritySymbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Parity{" +
                "paritySymbol=" + paritySymbol +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private ParitySymbol paritySymbol;
        private BigDecimal price;

        public Builder paritySymbol(ParitySymbol paritySymbol) {
            this.paritySymbol = paritySymbol;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Parity build() {
            return new Parity(this);
        }
    }
}
