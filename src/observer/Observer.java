package observer;

public abstract class Observer {

	protected String operation;
	protected Float number;

	protected Subject subject;

	public abstract void update(String operation, float number);

	public abstract String getOperation();

	public abstract void setOperation(String operation);

	public abstract Float getNumber();

	public abstract void setNumber(Float number);

}
