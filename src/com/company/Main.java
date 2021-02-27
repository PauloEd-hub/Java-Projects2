package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		method1();
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("******Method1 Start******");
		method2();
		System.out.println("******Method1 END******");
	}

		public static void method2() {
			System.out.println("******Method2 Start******");
			Scanner sc = new Scanner(System.in);
			try {
				String[] vect = sc.nextLine().split(" ");
				int position = sc.nextInt();
				System.out.println(vect[position]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.print("Invalid position");
			} catch (InputMismatchException e) {
				System.out.print("Input error");
			}

			sc.close();
			System.out.println("******Method2 END******");
		}
	}


