package code._02_moviereservation;

import java.math.BigDecimal;

public class Money {

    public static final Money ZERO = Money.wons(0);

    private final BigDecimal amount;

    public static Money wons(long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    private Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money plus(Money money) {
        return new Money(this.amount.add(money.amount));
    }

    public Money minus(Money money) {
        return new Money(this.amount.subtract(money.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThen(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThenOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }



}
