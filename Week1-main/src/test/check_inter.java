package test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class check_inter {
	public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            System.out.println("Kết nối thành công");
        } else {
            System.out.println("Kết nối thất bại");
        }
    }
}
