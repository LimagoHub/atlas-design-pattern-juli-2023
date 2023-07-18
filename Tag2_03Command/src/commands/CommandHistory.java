package commands;

public class CommandHistory {

    public void addCommand(final Command command) {
        if(command.isQuery()) return;
        // ....
    }

    public void undo() {
        System.out.println( "can't undo");
    }

    public void redo() {
        System.out.println( "can't redo");
    }
}
