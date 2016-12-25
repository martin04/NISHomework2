package observer;

import java.util.HashMap;
import java.util.Map.Entry;

public class Subject {

	private HashMap<String, Observer> lstObservers = new HashMap<String, Observer>();
	private double state;

	public double getState() {
		return state;
	}

	public void setState(double state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(String observerCounter, Observer observer) {
		lstObservers.put(observerCounter, observer);
	}

	public void detachObserver(String position) {
		lstObservers.remove(position);
		printMapStatus();
	}

	public void notifyAllObservers() {
		for (Entry<String, Observer> entry : lstObservers.entrySet()) {
			entry.getValue().update(entry.getValue().getOperation(), entry.getValue().getNumber(), true);
		}

		printMapStatus();
	}

	public HashMap<String, Observer> getLstObservers() {
		return lstObservers;
	}

	public void setLstObservers(HashMap<String, Observer> lstObservers) {
		this.lstObservers = lstObservers;
	}

	private void printMapStatus() {
		for (Entry<String, Observer> entry : lstObservers.entrySet()) {
			System.out.printf("observer #%s is %.2f\n", entry.getKey(), entry.getValue().stateCopy);
		}
	}

}
