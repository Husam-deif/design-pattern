package observer;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Station implements ISubject {

	ArrayList<Observers> Arr = new ArrayList<Observers>();
	String Wether;

	@Override
	public void addObserver(Observers s) {
		Arr.add(s);
	}

	@Override
	public void deleteObserver(Observers s) {
		Arr.remove(s);
	}

	@Override
	public void notifyObserver() {
		for (Observers observers : Arr) {
			observers.Update(Wether);
		}
	}

	public String getWether() {
		return Wether;
	}

	public void setWether(String wether) {
		Wether = wether;
		notifyObserver();
	}
	
	

}
