package expression.exceptions;

import expression.BinaryOperation;
import expression.MyExpression;
import expression.Operation;


/**
 * @author Rakhim Khakimov (ramhakimov@niuitmo.ru)
 */

public final class CheckedSubtract extends BinaryOperation {

    public CheckedSubtract(MyExpression first, MyExpression second) {
        super(first, second, "-");
    }

    @Override
    protected int resultOfOperation(int x, int y) {
        int res = x - y;
        if (x > 0 && y < 0 && res <= 0) {
            throw new OverflowException();
        }
        if (x < 0 && y > 0 && res >= 0) {
            throw new OverflowException();
        }
        if (x == 0 && y == Integer.MIN_VALUE) {
            throw new OverflowException();
        }
        return res;
    }

    @Override
    public int getPriority() {
        return Operation.PRIORITIES.get(Operation.SUB);
    }

    @Override
    public boolean isValuable() {
        return true;
    }
}