package processors;

public class CharacterCounter extends DefaultCounterHandler{


    @Override
    public void process(final char c) {
        counter ++;
    }

}
