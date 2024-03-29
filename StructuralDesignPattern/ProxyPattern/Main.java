package StructuralDesignPattern.ProxyPattern;

public class Main{
    public static void main(String[] args) {
        Internet adminInternet = new InternetProxy(true);
        Internet userInternet = new InternetProxy(false);

        try {
            // Admin access
            adminInternet.connectTo("example.com");

            // User access
            userInternet.connectTo("example.com");
            userInternet.connectTo("restrictedSite.com"); // This should throw an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
