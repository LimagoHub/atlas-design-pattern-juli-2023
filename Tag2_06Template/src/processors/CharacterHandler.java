package processors;

public interface CharacterHandler {

    void init();
    void dispose();

    void process(char c);
}
