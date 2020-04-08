package ca.jasper.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
    private void greet() {
        final List<String> greetings = new ArrayList<>();
        greetings.add("Doris");
        greetings.add("Jasper");

        for (final String greeting : greetings) {
           System.out.println(greeting);
        }
    }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static final void main (final String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();
    }
}
