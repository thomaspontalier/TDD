
public class Dollar extends Money{



    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    String currency() {
        return currency;
    }

    public boolean equals(Object object) {
        Money money= (Money) object;
        return amount == money.amount;
    }
}
