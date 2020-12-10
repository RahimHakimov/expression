package expression.exceptions;

/**
 * @author Rakhim Khakimov (ramhakimov@niuitmo.ru)
 */

public interface ExpressionSource {
    boolean hasNext();

    char next();

    String getPart();

    ParsingException error(final String message);
}
