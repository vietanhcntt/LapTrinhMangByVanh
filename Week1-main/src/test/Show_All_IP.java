package test;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class Show_All_IP {
	public static void main(String[] args) throws Exception {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface interface1 = interfaces.nextElement();
            System.out.println("Tên giao diện mạng: " + interface1.getDisplayName());

            Enumeration<InetAddress> addresses = interface1.getInetAddresses();
            while (addresses.hasMoreElements()) {
                InetAddress address = addresses.nextElement();

                System.out.println(" Loại địa chỉ IP: " + address.getClass().getSimpleName());
                System.out.println(" Địa chỉ IP: " + address.getHostAddress());

                if (!address.isLoopbackAddress()) {
                    try {
                        byte[] addressBytes = address.getAddress();
                        // Phân tích mảng byte addressBytes để lấy lớp mạng và mặt nạ mạng
                    } catch (Exception e) {
                        System.out.println(" Không thể lấy thông tin lớp mạng và mặt nạ mạng");
                    }
                }
            }
        }
    }
}
