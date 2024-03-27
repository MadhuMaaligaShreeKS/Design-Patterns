package BehavioralDesignPatterns.MementoPattern;

class Editor {
    private String text;

    public Editor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}