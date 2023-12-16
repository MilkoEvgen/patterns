package behavioral.interpreter;

public class NumberExpression implements Expression{
    int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
