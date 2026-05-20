package template1;

public class Product2 extends Bill {

	@Override
	public void calculateTotal(int x) {
		System.out.println("Total is: " + x * 4);
	}

}
