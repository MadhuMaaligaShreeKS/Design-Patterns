package StructuralDesignPattern.DecoratorPattern;

class PlainText implements Text {
    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    public String format() {
        return content;
    }
}