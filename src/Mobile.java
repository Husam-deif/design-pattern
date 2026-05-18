package observer;

public class Mobile implements Observers {

	String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void Update(String data) {
		this.data = data;
		Display();
	}

	void Display() {
		System.out.println("The wether is: " + data);
	}

}
