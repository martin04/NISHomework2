package main;

import java.util.Scanner;

import math.MathOperation;
import math.OperationAdd;
import math.OperationDivide;
import math.OperationMultiply;
import math.OperationSubstract;
import observer.Subject;

public class HomeworkMain {
	public static boolean newCommand;
	public static String command;
	private static Subject subjectA;
	private static Subject subjectB;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		subjectA = new Subject();
		subjectA.setState(10);

		subjectB = new Subject();
		subjectB.setState(5);

		while (true) {
			System.out.print("Set_val[A] Set_val[B] [+]AddObserver [-]RemoveObserver e[X]it >");
			command = scanner.nextLine();
			if (command.equals("+")) {
				System.out.print("\nSet New Observer (A|B)(+|-|*|/) <num>):");
			} else if (command.equals("-")) {
				System.out.print("\nSet New Observer (A|B)(+|-|*|/) <num>):");
			} else if (command.equals("A")) {
				Double newValue = null;
				System.out.print("Value = ");
				newValue = scanner.nextDouble();
				subjectA.setState(newValue);
			} else if (command.equals("B")) {
				Double newValueB = null;
				System.out.print("Value = ");
				newValueB = scanner.nextDouble();
				subjectB.setState(newValueB);
			} else if (command.equals("X")) {
				System.exit(0);
			}
		}
	}
}
