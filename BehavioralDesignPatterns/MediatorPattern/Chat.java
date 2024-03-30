package BehavioralDesignPatterns.MediatorPattern;
//concreteMediator
public class Chat implements ChatRoom {
    @Override
    public void sendMessage(String message, User user) {
        System.out.println(user.getName() + " sends: " + message);
    }
}

