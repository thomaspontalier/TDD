/**
 * Created by Thomas on 19/01/2015.
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
