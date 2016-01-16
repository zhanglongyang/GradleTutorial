package com.thoughtworks.gradletutorial;

import java.io.IOException;
import com.github.lalyos.jfiglet.FigletFont;

/**
 * Created by longyang.zhang on 1/14/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        for (String arg : args) {
            String asciiString = FigletFont.convertOneLine(arg);
            System.out.println(asciiString);
        }
    }
}
