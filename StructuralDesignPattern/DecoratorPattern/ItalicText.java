package StructuralDesignPattern.DecoratorPattern;

class ItalicText extends TextDecorator {
    public ItalicText(Text decoratedText) {
        super(decoratedText);
    }

    public String format() {
        return "<i>" + super.format() + "</i>";
    }
}