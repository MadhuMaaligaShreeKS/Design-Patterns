package BehavioralDesignPatterns.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new Chat();// Create a Chat object, which acts as the mediator
/// Create User objects with names and associate them with the chat room
        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);

        alice.sendMessage("Hi, Bob!");
        bob.sendMessage("Hello, Alice!");
    }
}
