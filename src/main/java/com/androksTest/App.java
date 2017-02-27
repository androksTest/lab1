package com.androksTest;

import com.sun.javafx.sg.PGShape;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Model model = new Model();
        if (args.length < 1)
            model.setValue("No arguments");
        else
            model.setValue(args);
        new Controller(model, new View()).process();
    }
}
