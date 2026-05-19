package Proxy;

public class RealInternet implements IInternet {

	@Override
	public void connect(String URL) {
		System.out.println("Connect to " + URL);
	}

}
