package StructuralDesignPattern.FlyWeightPattern;

public class TextProcessor {
    private FontFactory fontFactory;

    public TextProcessor(FontFactory fontFactory) {
        this.fontFactory = fontFactory;
    }

    public void applyFont(String name, int size, boolean bold, boolean italic, String text) {
        Font font = fontFactory.getFont(name, size, bold, italic);
        font.apply(text);
    }

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        TextProcessor textProcessor = new TextProcessor(fontFactory);

        // Applying different fonts to text fragments
        textProcessor.applyFont("Arial", 12, true, false, "Hello");
        textProcessor.applyFont("Times New Roman", 14, false, true, "World");
        textProcessor.applyFont("Arial", 12, true, false, "Java"); // Reusing the same font properties
    }
}
