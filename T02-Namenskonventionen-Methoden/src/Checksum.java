package t2;

import java.util.Scanner;

public class Checksum {

	public static int computeChecksum(int number) {
		int sum = 0;
		while (0 != number) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		return sum;
	}

	public static void printNumbersSameChecksum(int a, int b, int checkSum) {

		System.out.println("Die gleiche Quersumme haben unter anderem auch: ");
		for (int i = a; i <= b; i++) {
			int qs = computeChecksum(i);
			if (qs == checkSum) {
				System.out.print(i + ", ");
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte Ganzzahl eingeben: ");

		int i = scanner.nextInt();

		System.out.println("Zahl: " + i + " --> Quersumme: " + computeChecksum(i) + "\n");

		printNumbersSameChecksum(0, 1000, computeChecksum(i));
	}
}
