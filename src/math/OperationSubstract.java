package math;

public class OperationSubstract implements MathStrategy {

	@Override
	public double doMathOperation(double num1, double num2) {
		return num1 - num2;
	}
}
