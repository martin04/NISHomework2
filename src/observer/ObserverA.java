package observer;

import math.MathOperation;
import math.OperationAdd;
import math.OperationDivide;
import math.OperationMultiply;
import math.OperationSubstract;

public class ObserverA extends Observer {

	public ObserverA(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update(String operation, float number) {
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
			subject.setState(context.doMath(subject.getState(), number));
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
