package expression;

import java.util.List;

/**
 * @author Rakhim Khakimov (ramhakimov@niuitmo.ru)
 */

public class OperationsInfo {

    public static int getStartPriority() {
        return 5;
    }

    public static int getStep() {
        return -1;
    }

    public static int getPriority(Operation operation) {
        switch (operation) {
            case OR:
                return 5;
            case XOR:
                return 4;
            case AND:
                return 3;
            case ADD:
            case SUB:
                return 2;
            case MUL:
            case DIV:
                return 1;
            case SQRT:
            case ABS:
            case VAR:
            case CONST:
                return 0;
            default:
                return -1;
        }
    }

    public static boolean checkVariable(String variable) {
        switch (variable) {
            case "x":
            case "y":
            case "z":
                return true;
            default:
                return false;
        }
    }

    public static List<Operation> getOperationFromPriority(int priority) {
        switch (priority) {
            case 5:
                return List.of(Operation.OR);
            case 4:
                return List.of(Operation.XOR);
            case 3:
                return List.of(Operation.AND);
            case 2:
                return List.of(Operation.ADD, Operation.SUB);
            case 1:
                return List.of(Operation.MUL, Operation.DIV);
            default:
                return null;
        }
    }

    public static char getBinaryOperator(Operation operation) {
        switch (operation) {
            case OR:
                return '|';
            case XOR:
                return '^';
            case AND:
                return '&';
            case ADD:
                return '+';
            case SUB:
                return '-';
            case MUL:
                return '*';
            case DIV:
                return '/';
            default:
                return '\0';
        }
    }

    public static Operation getUnaryOperation(String operator) {
        switch (operator) {
            case "abs":
                return Operation.ABS;
            case "sqrt":
                return Operation.SQRT;
            default:
                return null;
        }
    }
}
