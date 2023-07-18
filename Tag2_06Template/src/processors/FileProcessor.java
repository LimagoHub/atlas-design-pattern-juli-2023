package processors;

import java.io.FileReader;

public abstract class FileProcessor {

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

    public void init() {
        // NOP
    }
    public void dispose() {
        // NOP
    }

    public abstract void  process(char c);
}
