package CreationalDesignPatterns.SingletonDesignPattern;

public class Logger {
    // Static variable to hold the single instance
    private static Logger instance;

    // Private constructor to prevent direct instantiation
    private Logger() {
        // Initialize logging settings (e.g., open log file)
        System.out.println("Logger initialized.");
    }
    // Get the singleton instance
    public static Logger getInstance() {
         // Check if instance is null
        if (instance == null) {
            // Create a new instance if null
            instance = new Logger();
        }
        return instance;
    }
    // Log a message
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

