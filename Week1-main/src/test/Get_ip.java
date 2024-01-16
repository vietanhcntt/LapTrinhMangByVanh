package test;
import java.net.*;
public class Get_ip {
	public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.google.com");
        String ipAddress = address.getHostAddress();
        System.out.println(ipAddress);
    }
}
