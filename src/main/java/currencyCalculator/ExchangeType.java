package currencyCalculator;

import java.math.BigDecimal;

public enum ExchangeType {
    EURMYR("EUR","MYR", new BigDecimal("4,85")),
    MYREUR("MYR", "EUR", new BigDecimal("0,21"));


    private String baseCurrency;
    private String targetCurrency;
    private BigDecimal exchangeRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    ExchangeType(String baseCurrency, String targetCurrency, BigDecimal exchangeRate) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
    }
}
