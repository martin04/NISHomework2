package main;

import java.util.Scanner;

import math.MathOperation;
import math.OperationAdd;
import math.OperationDivide;
import math.OperationMultiply;
import math.OperationSubstract;

public class HomeworkMain {
	public static boolean newCommand;
	public static String command;

	public static void produce() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				while (true) {
					System.out.print("Set_val[A] Set_val[B] [+]AddObserver [-]RemoveObserver e[X]it >");
					command = scanner.nextLine();
					newCommand = true;
				}
			}
		}).start();

	}

	public static void consume() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					if (newCommand) {
						switch (command) {
						case "+":
							break;
						case "-":
							break;
						case "A":
							break;
						case "B":
							break;
						case "X":
							System.exit(0);
							break;
						default:
							break;
						}
					}
				}
			}
		}).start();
	}

	public static void main(String[] args) {

		// TODO: create two threads that simulate CONSUMER -> PRODUCER problem
		produce();
		consume();
		// MathOperation context = new MathOperation(new OperationAdd());
		// System.out.println("10 + 5 = " + context.doMath(10, 5));
		//
		// context = new MathOperation(new OperationSubstract());
		// System.out.println("10 - 5 = " + context.doMath(10, 5));
		//
		// context = new MathOperation(new OperationMultiply());
		// System.out.println("10 * 5 = " + context.doMath(10, 5));
		//
		// context = new MathOperation(new OperationDivide());
		// System.out.println("10 / 5 = " + context.doMath(10, 2.5));
	}
}
