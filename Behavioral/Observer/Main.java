package observer;

public class Main {

	public static void main(String[] args) {
		Mobile M1 = new Mobile();
		Mobile M2 = new Mobile();
		Mobile M3 = new Mobile();
		Station S1 = new Station();
		S1.addObserver(M2);
		S1.addObserver(M3);
		M1.setData("Hot");
		M1.Display();
		M2.setData("Hot");
		M2.Display();
		M3.setData("Hot");
		M3.Display();
		System.out.println();
		S1.setWether("Coold");
	}

}
