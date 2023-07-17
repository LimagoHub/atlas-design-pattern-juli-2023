package flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharachter {

    private static final List<AttributedCharachter> charachters = new ArrayList<>();

    private final char c;
    private final boolean bold;

    public static AttributedCharachter getInstance(final char c, final boolean bold) {
        for (AttributedCharachter attributedCharachter :charachters ) {
            if(c == attributedCharachter.c && bold == attributedCharachter.bold)
                return attributedCharachter;
        }
        return new AttributedCharachter(c,bold);
    }

    private AttributedCharachter(final char c, final boolean bold) {
        this.c = c;
        this.bold = bold;
        charachters.add(this);
    }

    public char getC() {
        return c;
    }

    public boolean isBold() {
        return bold;
    }
}
