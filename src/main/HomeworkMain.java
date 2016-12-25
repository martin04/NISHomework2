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

		float state1 = 10;
		float state2 = 5;
		
		produce();
		consume();
	}
}
