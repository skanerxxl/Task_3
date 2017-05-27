package ru.rambler.skanerxxl;

import java.util.Scanner;

/*
 * Find the sum of the digits in the number 100! (i.e. 100 factorial) {Correct answer: 648}
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input number");
		int f = scanner.nextInt();
		scanner.close();

		Factorial factorial = new Factorial();
		factorial.generateFactorial(f);

		System.out.println("factorial of the number: " + factorial.toString());

		int sumFac = factorial.sumOfDigitsOfFactorial();
		System.out.println("sum of digits of factorial: " + sumFac);

	}

}
