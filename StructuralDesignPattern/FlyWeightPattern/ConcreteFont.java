package StructuralDesignPattern.FlyWeightPattern;

class ConcreteFont implements Font {
    private final String name;
    private final int size;
    private final boolean bold;
    private final boolean italic;

    public ConcreteFont(String name, int size, boolean bold, boolean italic) {
        this.name = name;
        this.size = size;
        this.bold = bold;
        this.italic = italic;
    }

    @Override
    public void apply(String text) {
        System.out.println("Applying font: " + name + ", Size: " + size +
                ", Bold: " + bold + ", Italic: " + italic + " to text: '" + text + "'");
    }
}