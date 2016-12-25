package observer;

import java.util.Map.Entry;

import math.MathOperation;
import math.OperationAdd;
import math.OperationDivide;
import math.OperationMultiply;
import math.OperationSubstract;

public class ObserverA extends Observer {

	public ObserverA(Subject subject, String operation, Float number, Integer observerCounter) {
		this.subject = subject;
		this.operation = operation;
		this.number = number;
		this.subject.attach(String.valueOf(observerCounter), this);
		update(operation, number, false);
	}

	@Override
	public void update(String operation, float number, boolean isNotifying) {
		MathOperation context = null;
		switch (operation) {
		case "+":
			context = new MathOperation(new OperationAdd());
			break;
		case "-":
			context = new MathOperation(new OperationSubstract());
			break;
		case "*":
			context = new MathOperation(new OperationMultiply());
			break;
		case "/":
			context = new MathOperation(new OperationDivide());
			break;

		default:
			break;
		}

		if (context != null) {
			stateCopy = (float) context.doMath(subject.getState(), number);
			if (!isNotifying) {
				for (Entry<String, Observer> entry : subject.getLstObservers().entrySet()) {
					System.out.printf("observer #%s is %.2f\n", entry.getKey(), entry.getValue().stateCopy);
				}
			}
		} else {
			System.out.println("Cannot do math  :(");
		}
	}

	@Override
	public String getOperation() {
		return this.operation;
	}

	@Override
	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public Float getNumber() {
		return this.number;
	}

	@Override
	public void setNumber(Float number) {
		this.number = number;
	}

}
