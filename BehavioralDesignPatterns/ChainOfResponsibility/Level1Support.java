package BehavioralDesignPatterns.ChainOfResponsibility;

class Level1Support implements SupportHandler {
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getLevel() <= 1) {
            System.out.println("Level 1 Support is handling the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No suitable support available to handle the request.");
        }
    }
}

