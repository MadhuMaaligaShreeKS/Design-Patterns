package StructuralDesignPattern.DecoratorPattern;

class BoldText extends TextDecorator {
    public BoldText(Text decoratedText) {
        super(decoratedText);
    }

    public String format() {
        return "<b>" + super.format() + "</b>";
    }
}