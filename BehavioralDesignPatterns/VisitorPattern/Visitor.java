package BehavioralDesignPatterns.VisitorPattern;

public interface Visitor {
    void visit(Square square);
    void visit(Circle circle);
  }