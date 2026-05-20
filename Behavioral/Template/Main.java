package template1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Bill P1 = new Product1();
		P1.printBill(5);
		System.out.println();
		Bill P2 = new Product2();
		P2.printBill(5);
		
	}

}
