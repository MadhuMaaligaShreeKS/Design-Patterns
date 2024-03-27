package BehavioralDesignPatterns.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new Chat();

        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);

        alice.sendMessage("Hi, Bob!");
        bob.sendMessage("Hello, Alice!");
    }
}
