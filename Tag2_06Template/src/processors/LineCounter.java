package processors;

public class LineCounter extends DefaultCounterHandler{



    @Override
    public void process(final char c) {
        if(c == '\n') counter ++;
    }
}
