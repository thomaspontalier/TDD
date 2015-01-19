/**
 * Created by Thomas on 19/01/2015.
 */
class Money implements Expression{
    protected int amount;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }

    protected String currency;
    String currency() {
        return currency;
    }



    public String toString() {
        return amount + " " + currency;
    }
}
