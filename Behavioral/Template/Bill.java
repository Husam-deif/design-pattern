package template1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Bill {

	public static void printTodayDate() {
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("EEEE, dd-MM-yyyy");

        System.out.println(today.format(formatter));
    }
	public void Header() {
		System.out.println("This is a pill for this product ");
	}
	abstract public void calculateTotal(int x); 
	
	final void printBill(int x) {
		Header();
		printTodayDate();
		calculateTotal(x);
		
	}
	
}
