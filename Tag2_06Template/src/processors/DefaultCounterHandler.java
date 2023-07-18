package processors;

public abstract class DefaultCounterHandler implements CharacterHandler {

    protected int counter;


    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void dispose() {
        System.out.printf("%s = %s%n", getClass().getSimpleName(), counter);
    }
}


