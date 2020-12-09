package expression;

/**
 * @author Rakhim Khakimov (ramhakimov@niuitmo.ru)
 */

public class BitwiseXor extends BinaryOperation {

    public BitwiseXor(MyExpression first, MyExpression second) {
        super(first, second, "^");
    }

    @Override
    protected int resultOfOperation(int x, int y) {
        return x ^ y;
    }

    @Override
    public int getPriority() {
        return Operation.PRIORITIES.get(Operation.XOR);
    }

    @Override
    public boolean isValuable() {
        return false;
    }
}