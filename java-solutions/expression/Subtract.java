package expression;

/**
 * @author Rakhim Khakimov (ramhakimov@niuitmo.ru)
 */

public class Subtract extends BinaryOperation {

    public Subtract(MyExpression first, MyExpression second) {
        super(first, second, "-");
    }

    @Override
    protected int resultOfOperation(int x, int y) {
        return x - y;
    }

    @Override
    public int getPriority() {
        return InformationAboutOperations.PRIORITIES.get(Operation.SUB);
    }

    @Override
    public boolean isValuable() {
        return true;
    }
}