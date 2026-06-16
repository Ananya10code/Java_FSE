package Design_Principles_Patterns.Excercise1;

public class Singleton {

    public static void main(String[] args) {

        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("Application started.");
        log2.log("Processing data.");

        if (log1 == log2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple Logger instances exist.");
        }
    }
}
