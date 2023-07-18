package processors;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    private List<CharacterHandler> handlers = new ArrayList<>();

    public boolean add(final CharacterHandler characterHandler) {
        return handlers.add(characterHandler);
    }

    public boolean remove(final CharacterHandler characterHandler) {
        return handlers.remove(characterHandler);
    }

    public final void run(String filename) {
        try(FileReader reader = new FileReader(filename)) {
            init();
            int c;
            while((c = reader.read()) != -1) {
               process((char) c);
            }

            dispose();

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    private void init() {
        handlers.forEach(h->h.init());
    }
    private void dispose() {
        handlers.forEach(h->h.dispose());
    }

    private  void  process(char c){
        handlers.forEach(h->h.process(c));
    }
}
