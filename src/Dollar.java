
public class Dollar {
    private int amount;

    Dollar(int a){
        amount=a;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar= (Dollar) object;
        return amount == dollar.amount;
    }


}
