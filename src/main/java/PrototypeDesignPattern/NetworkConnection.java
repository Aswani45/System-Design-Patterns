package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String ipAddress;
    private List<String> domains = new ArrayList<>();


    public String getIpAddress(){
        return ipAddress;
    }

    public void setIpAddress(String ipAddress){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.ipAddress = ipAddress;
    }
    public void addDomain(String domain){
        this.domains.add(domain);
    }
    public List<String> getDomains(){
        return domains;
    }

    @Override
    public NetworkConnection clone() throws CloneNotSupportedException{
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.ipAddress = this.ipAddress;
        networkConnection.domains = new ArrayList<>(this.domains);
        return networkConnection;
    }
}
