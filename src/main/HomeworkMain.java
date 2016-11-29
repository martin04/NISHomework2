package main;

import math.MathOperation;
import math.OperationAdd;
import math.OperationDivide;
import math.OperationMultiply;
import math.OperationSubstract;

public class HomeworkMain {

	public static void main(String[] args) {
		
		//TODO: create two threads that simulate CONSUMER -> PRODUCER problem
		
		MathOperation context = new MathOperation(new OperationAdd());
		System.out.println("10 + 5 = " + context.doMath(10, 5));

		context = new MathOperation(new OperationSubstract());
		System.out.println("10 - 5 = " + context.doMath(10, 5));

		context = new MathOperation(new OperationMultiply());
		System.out.println("10 * 5 = " + context.doMath(10, 5));

		context = new MathOperation(new OperationDivide());
		System.out.println("10 / 5 = " + context.doMath(10, 2.5));
	}
}
