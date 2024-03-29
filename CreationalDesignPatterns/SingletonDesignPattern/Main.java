package CreationalDesignPatterns.SingletonDesignPattern;

public class Main{
    public static void main(String[] args) {
    // Get the singleton logger instance
    Logger logger = Logger.getInstance();

    // Log some messages
    logger.log("Application started.");
    logger.log("Processing user request.");
    logger.log("Application shutdown.");

    // Attempt to create another logger instance (won't work)
    Logger anotherLogger = Logger.getInstance();
    System.out.println("Is the same logger instance? " + (logger == anotherLogger));
    }
}
