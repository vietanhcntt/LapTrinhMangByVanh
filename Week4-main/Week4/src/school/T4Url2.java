package school;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class T4Url2 {
	public static void main(String[] args) {
		try {
			URL url = new URL("Https://www.google.com");
			URLConnection urlConnection = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			FileWriter fileWriter = new FileWriter("output.html");
			String line="";
			while((line = reader.readLine())!=null ) {
				fileWriter.write(line+"\n");
			}
			reader.close();
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
