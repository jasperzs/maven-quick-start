package ca.jasper.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
    public int countWords(final String words) {
        final String[] splittedWords = StringUtils.split(words, " ");

        return splittedWords == null ? 0 : splittedWords.length;
    }

    public void greet() {
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

        final int numOfWords = app.countWords("I am your lord!");
        System.out.println("There are " + numOfWords + " words");
    }
}
