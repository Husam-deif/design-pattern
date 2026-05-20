package template1;

public class Product1 extends Bill {

	@Override
	public void calculateTotal(int x) {
		System.out.println("Total is: " + x * 6);
	}

}
