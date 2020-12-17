package expression.exceptions;

import expression.MyExpression;
import expression.Subtract;


/**
 * @author Rakhim Khakimov (ramhakimov@niuitmo.ru)
 */

public final class CheckedSubtract extends Subtract {

    public CheckedSubtract(MyExpression first, MyExpression second) {
        super(first, second);
    }

    @Override
    protected int resultOfOperation(int x, int y) {
        if (y < 0 && Integer.MAX_VALUE + y < x) {
            throw new OverflowException();
        }
        if (y > 0 && (Integer.MIN_VALUE + y > x)) {
            throw new OverflowException();
        }
        return super.resultOfOperation(x, y);
    }
}