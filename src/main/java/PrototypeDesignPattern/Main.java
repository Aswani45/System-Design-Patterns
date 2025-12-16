package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIpAddress("192.168.1.1");
        networkConnection.addDomain("google.com");
        networkConnection.addDomain("facebook.com");
        NetworkConnection networkConnection2 = networkConnection.clone();
        System.out.println("Before removing google.com networkConnection "+networkConnection.getDomains());
        System.out.println("Before removing google.com networkConnection2 "+networkConnection2.getDomains());
        networkConnection.getDomains().remove("google.com");
        System.out.println("After removing google.com networkConnection "+networkConnection.getDomains());
        System.out.println("After removing google.com networkConnection2 "+networkConnection2.getDomains());
    }
}
