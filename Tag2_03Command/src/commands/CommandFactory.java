package commands;

import java.lang.reflect.InvocationTargetException;

public class CommandFactory {

    private static final String PREFIX = "commands.";
    private static final String SUFFIX = "Command";

    public static Command create(String zeile) {
        try {
            Command result = null;
            String tokens[] = zeile.split(" ");

            result = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX).getConstructor().newInstance();
            result.parse(tokens);

            return result;
        } catch (Throwable e) {
            System.out.println("Unbekannter Befehl");
            return null;
        }
    }
}
