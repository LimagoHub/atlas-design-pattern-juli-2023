package processors;

public class LineCounter extends FileProcessor{

    private int counter;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void dispose() {
        System.out.println("Lines = " + counter);
    }

    @Override
    public void process(final char c) {
        if(c == '\n') counter ++;
    }
}
