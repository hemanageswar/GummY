package org.constuctorclass;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		System.out.println("hai");
		System.out.println("hello");
		System.out.println("how are you");
		System.out.println("i am fine");
		System.out.println("how you doing");
		System.out.println("not good");

		for (int i = 1; i <= 5; i++) {
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();

			if (a >= 18) {
				System.out.println(a + "Eligible");
				continue;

			} else if (a < 18) {

				System.out.println(a + "not Eligible");
				continue;

			}
			break;
		}

	}
}
