package BehavioralDesignPatterns.VisitorPattern;

public interface Shape {
    void accept(Visitor visitor);
}
