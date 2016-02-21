package ua.artcode.design_patterns.decorator;

import java.io.*;

/**
 * Created by serhii on 21.02.16.
 */
public class TestDecorator {

    public static final String PATH = "/home/serhii/dev/IdeaProjects/ACO11/src/ua/artcode/design_patterns/adapter/Militioner.java";

    public static void main(String[] args) throws IOException {
        PushbackReader reader = new PushbackReader(
                new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(PATH))));


        char element = (char)reader.read();

    }
}
