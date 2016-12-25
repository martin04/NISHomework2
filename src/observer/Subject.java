package observer;

import java.util.ArrayList;

public class Subject {

	private ArrayList<Observer> lstObservers = new ArrayList<Observer>();
	private double state;

	public double getState() {
		return state;
	}

	public void setState(double state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		lstObservers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : lstObservers) {
			observer.update(observer.getOperation(), observer.getNumber());
		}
	}

}
