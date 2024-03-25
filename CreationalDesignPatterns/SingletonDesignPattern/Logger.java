package CreationalDesignPatterns.SingletonDesignPattern;

public class Logger {
    private static Logger instance;

    // Private constructor to prevent direct instantiation
    private Logger() {
        // Initialize logging settings (e.g., open log file, set log level)
        System.out.println("Logger initialized.");
    }

    // Get the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Log a message
    public void log(String message) {
        System.out.println("Log: " + message);
    }

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
