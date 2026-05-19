package Proxy;

import java.util.ArrayList;

public class ProxyInternet implements IInternet {

	RealInternet R;

	static ArrayList<String> unAuthorized;

	static {
		unAuthorized = new ArrayList<String>();
		unAuthorized.add("aaa.com");
		unAuthorized.add("bbb.com");
		unAuthorized.add("ccc.com");

	}

	@Override
	public void connect(String URL) {
		if (unAuthorized.contains(URL)) {
			System.out.println("URL is not Authorized");
		}
		else {
			R=new RealInternet();
			R.connect(URL);
		}
	}

}
