package StructuralDesignPattern.ProxyPattern;

class InternetProxy implements Internet {
    private Internet realInternet;
    private boolean isAdmin;

    public InternetProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
        realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (isAdmin) {
            realInternet.connectTo(serverHost);
        } else {
            if (serverHost.equals("restrictedSite.com")) {
                throw new Exception("Access Denied: You do not have permission to access this site.");
            } else {
                realInternet.connectTo(serverHost);
            }
        }
    }
}
