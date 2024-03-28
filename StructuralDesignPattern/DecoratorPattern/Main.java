package StructuralDesignPattern.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Creating plain text
        Text text = new PlainText("Hello, World!");

        // Applying bold formatting
        text = new BoldText(text);
        System.out.println("Formatted text: " + text.format());

        // Applying italic formatting
        text = new ItalicText(text);
        System.out.println("Formatted text: " + text.format());

        // Applying both bold and italic formatting
        text = new BoldText(new ItalicText(text));
        System.out.println("Formatted text: " + text.format());
    }
}
