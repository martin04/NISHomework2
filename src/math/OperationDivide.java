package math;

public class OperationDivide implements MathStrategy {

	@Override
	public double doMathOperation(double num1, double num2) {
		double toReturn = 0.0;
		try {
			toReturn = num1 / num2;
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
		}
		return toReturn;
	}
}
