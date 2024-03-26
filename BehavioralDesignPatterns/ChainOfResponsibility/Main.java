package BehavioralDesignPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler level1Handler = new Level1Support();
        SupportHandler level2Handler = new Level2Support();

        // Set up the chain
        level1Handler.setNextHandler(level2Handler);

        // Create requests
        Request request1 = new Request(1);
        Request request2 = new Request(2);
        Request request3 = new Request(3);

        // Process requests
        level1Handler.handleRequest(request1); // Should be handled by Level 1 support
        level1Handler.handleRequest(request2); // Should be handled by Level 2 support
        level1Handler.handleRequest(request3); // Should not be handled by any support
    }
}
