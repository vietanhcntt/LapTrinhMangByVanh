package school;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class T4InetAdress {
	public static void main(String[] args) {
		try {
			InetAddress addByName = InetAddress.getByName("www.google.com");
			InetAddress addByIp = InetAddress.getByName("192.168.9.215");
			System.out.println("address by Name :"+addByName);
			System.out.println("address by IP "+addByIp);
			//lay ten may chu
			InetAddress addByName1 = InetAddress.getByName("www.google.com");
			String hostname = addByName1.getHostName();
			System.out.println("Host Name : "+hostname);
			// lay dia chi IP
			String Ip = addByName1.getHostAddress();
			System.out.println("dia chi Ip "+Ip);
			//kiem tra dia chi ip co phai dia chi 4 hay khonng
			InetAddress addByName2 = InetAddress.getByName("www.google.com");
			boolean isIp4 = addByName2 instanceof java.net.Inet4Address;
			System.out.println("co phai dia chi ip4 khong "+isIp4);
			boolean isIp6 = addByName2 instanceof java.net.Inet6Address;
			System.out.println("co phai dia chi ip4 khong "+isIp6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
