package commands;

public abstract class AbstractCommand implements Command{
    @Override
    public void parse(final String[] tokens) {

    }


    @Override
    public void undo() {
        throw new UnsupportedOperationException("Upps");
    }

    @Override
    public boolean isQuery() {
        return true;
    }
}
