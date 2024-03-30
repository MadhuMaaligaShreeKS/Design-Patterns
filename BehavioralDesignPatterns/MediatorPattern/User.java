package BehavioralDesignPatterns.MediatorPattern;

class User {
    private String name;
    private ChatRoom chatRoom;
// Constructor to initialize user with name and chat room
    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String message) {
        chatRoom.sendMessage(message, this);  // Call the sendMessage method of the chat room and pass the message and user object
    }
    public String getName() {
        return name;
    }
}