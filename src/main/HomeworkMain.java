package main;

import java.util.Scanner;

import observer.ObserverA;
import observer.Subject;

public class HomeworkMain {
	public static boolean newCommand;
	public static String command;
	private static Subject subjectA;
	private static Subject subjectB;
	private static Scanner scanner;

	public static void main(String[] args) {
		boolean firstStart = true;
		int observerCounter = 0;
		scanner = new Scanner(System.in);
		subjectA = new Subject();
		subjectA.setState(10);

		subjectB = new Subject();
		subjectB.setState(5);

		command = "";

		while (true) {
			if (firstStart) {
				System.out.print("Set_val[A] Set_val[B] [+]AddObserver [-]RemoveObserver e[X]it >");
				firstStart = false;
			}

			if (command.equals("+")) {
				System.out.print("Set New Observer (A|B)(+|-|*|/) <num>):");
				String operation = scanner.nextLine();
				if (operation.startsWith("a") || operation.startsWith("A")) {
					new ObserverA(subjectA, operation.substring(1,2), Float.parseFloat(operation.substring(2, operation.length())),
							observerCounter);
					observerCounter++;
				} else {
					new ObserverA(subjectB, operation.substring(1,2),
							Float.parseFloat(operation.substring(2, operation.length())),
							observerCounter);
					observerCounter++;
				}
				command = "";
				System.out.print("Set_val[A] Set_val[B] [+]AddObserver [-]RemoveObserver e[X]it >");
			} else if (command.equals("-")) {
				System.out.print("Remove observer (#)");
				int observerPosition = scanner.nextInt();
				if (subjectA.getLstObservers().containsKey(String.valueOf(observerPosition))) {
					subjectA.detachObserver(String.valueOf(observerPosition));
				} else {
					subjectB.detachObserver(String.valueOf(observerPosition));
				}
				command = "";
				System.out.print("Set_val[A] Set_val[B] [+]AddObserver [-]RemoveObserver e[X]it >");
			} else if (command.equalsIgnoreCase("A")) {
				Double newValue = null;
				System.out.print("Value = ");
				newValue = scanner.nextDouble();
				subjectA.setState(newValue);
				command = "";
				System.out.print("Set_val[A] Set_val[B] [+]AddObserver [-]RemoveObserver e[X]it >");
			} else if (command.equalsIgnoreCase("B")) {
				Double newValueB = null;
				System.out.print("Value = ");
				newValueB = scanner.nextDouble();
				subjectB.setState(newValueB);
				command = "";
				System.out.print("Set_val[A] Set_val[B] [+]AddObserver [-]RemoveObserver e[X]it >");
			} else if (command.equals("X")) {
				System.exit(0);
			} else {
				command = scanner.nextLine();
			}
		}
	}
}
