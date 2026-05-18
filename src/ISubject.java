package observer;

public interface ISubject {

	public void addObserver(Observers s);
	public void deleteObserver(Observers s);
	public void notifyObserver();

}
