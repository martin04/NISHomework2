package math;

public class MathOperation {
	
	private MathStrategy strategy;
	
	public MathOperation(MathStrategy strategy) {
		this.strategy = strategy;
	}

	public double doMath(double num1, double num2){
		return strategy.doMathOperation(num1, num2);
	}
}
