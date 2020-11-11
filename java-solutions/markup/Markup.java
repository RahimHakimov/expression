package markup;

import java.io.*;
import java.util.*;

/**
 * @author Rakhim Khakimov
 */


public interface Markup {
    void toMarkdown(StringBuilder s);

    void toHtml(StringBuilder s);

    void toBBCode(StringBuilder s);
}
