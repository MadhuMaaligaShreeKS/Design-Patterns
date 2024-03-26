package BehavioralDesignPatterns.InterpreterPattern;

public class Main {
    public static void main(String[] args) {
        Expression expression = new Add(new Number(1), new Subtract(new Number(3), new Number(2)));

        // Interpret and get the result
        int result = expression.interpret();
        System.out.println("Result: " + result); // Output: Result: 0
    }
}

