
public class Dollar extends Money{


    Dollar(int a){
        amount=a;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

    public boolean equals(Object object) {
        Money money= (Money) object;
        return amount == money.amount;
    }


}
