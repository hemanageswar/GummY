package org.constuctorclass;

import java.util.Scanner;

public class ScannerClass {
	private static void mau() {
		System.out.println("asdfhj");
	}

	public static void main(String[] args) {
		mau();
		mau();
		System.out.println("hai");
		System.out.println("hello");
		System.out.println("how are you");
		System.out.println("i am fine");
		System.out.println("how you doing");
		System.out.println("not good");
		System.out.println("starting of scanner class");
		System.out.println("no end here after");
		System.out.println("from eclipse");
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
		System.out.println();
	}
}
