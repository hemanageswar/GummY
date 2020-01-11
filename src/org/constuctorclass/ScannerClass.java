package org.constuctorclass;

import java.util.Scanner;

public class ScannerClass {
	private void met() {
System.out.println("hello");
	}
	public static void main(String[] args) {

		for (int i = 1; i <=5;i++) {
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();

			if (a >= 18) {
				System.out.println(a + "Eligible");
				continue;

			} 
			else if (a<18) {
				
				System.out.println(a + "not Eligible");
				continue;

			}
			break;
		}
	}
}
