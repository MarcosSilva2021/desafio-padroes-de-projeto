package javaPuro;

public abstract class SocialNetwork {
    public String username;
    public String password;
    public SocialNetwork(){}
    // template method
    public boolean postData(String message) {
        if (login(this.username, this.password)) {
            boolean res = sendData(message.getBytes());
            logout();
            return res;
        }
        return false;
    }
    // abstract methods (subclasses will implement them)
    public abstract boolean login (String username, String password);
    public abstract boolean sendData (byte[] data);
    public abstract void logout ();


}
