
public class Dollar {
    public int amount;

    Dollar(int a){
        amount=a;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }


}
