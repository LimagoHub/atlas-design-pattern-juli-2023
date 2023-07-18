package processors;

public class CharacterCounter extends FileProcessor{

    private int counter = 0;
    @Override
    public void process(final char c) {
        counter ++;
    }

    @Override
    public void dispose() {
        System.out.println("Characters = " + counter);
    }
}
