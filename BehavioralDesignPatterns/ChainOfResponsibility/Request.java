package BehavioralDesignPatterns.ChainOfResponsibility;

class Request {
    private int level;

    public Request(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

