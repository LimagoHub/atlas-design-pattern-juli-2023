package main;

import processors.CharacterCounter;
import processors.FileProcessor;
import processors.LineCounter;

public class Main {
    public static void main(String[] args) {

        FileProcessor processor = new FileProcessor();
        processor.add(new CharacterCounter());
        processor.add(new LineCounter());
        processor.run("C:\\Users\\JoachimWagner\\git\\Atlas\\atlas-design-pattern-juli-2023\\Tag2_06Template\\src\\resource\\StorGroupPolicy.log");

    }
}