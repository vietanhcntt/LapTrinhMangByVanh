package school;

import java.net.URL;

public class T4Url {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://roadmap.sh/signup?provider=google&state=8VwLrogPAcFSlzPeZ40GiVv4lXCdx8jT2jRWbqKaRoo&code=4%2F0AfJohXkM3uCdpTtJDaeHjZpUQy5ap3_Vz-2zHWyszI14FAxKGyR5Dz6FBaeWExGGFDk8Bg&scope=email+profile+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.profile+openid&authuser=0&prompt=none");
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host: "+url.getHost());
			System.out.println("Port: "+url.getPort());
			System.out.println("Path: "+url.getPath());
			System.out.println("Truy van: "+url.getQuery());
			System.out.println("Tham chieu: "+url.getRef());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
