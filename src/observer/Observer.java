package observer;

public abstract class Observer {

	protected String operation;
	protected Float number;
	protected Float stateCopy;

	protected Subject subject;

	public abstract void update(String operation, float number, boolean isNotifying);

	public abstract String getOperation();

	public abstract void setOperation(String operation);

	public abstract Float getNumber();

	public abstract void setNumber(Float number);

}
