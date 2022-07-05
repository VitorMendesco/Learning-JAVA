package com.java;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// print in output
		System.out.println("Hello World!");

		/*-------------------DATA AND VARIABLES-------------------*/
		// integer numbers
		byte byteVar = 127; // default: 0
		short shortVar = 1000; // default: 0
		int intVar = 1200300; // default: 0
		long longVar = 300000000; // default: 0L
		// decimal numbers
		float floatVar = 14.8f; // default: 0.0f
		double doubleVar = 14.8290; // 2x more than FLOAT || default: 0.0d
		// strings
		char charVar = '0'; // default: '\u0000'
		String stringVar = "Vitor"; // default: null
		// boolean
		boolean booleanVar = true; // default: false

		System.out.println(
				"---NUMBERS---\n" + 
						"byte: " + byteVar + " (very small range)\n" + 
						"short: " + shortVar + " (small range)\n" + 
						"int: " + intVar + " (medium range)\n" + 
						"long: " + longVar + " (long range)\n" +
						"float: " + floatVar + " (decimal - less accuracy)\n" + 
						"double: " + doubleVar + " (decimal - more accuracy)\n" + 
						"---STRINGS---\n" + 
						"char: " + charVar + " (just one letter)\n" + 
						"String: " + stringVar + " (more letters)\n" + 
						"---BOOL---\n" + 
						"boolean: " + booleanVar + " (boolean: true ? false)\n"
				);

		/*-------------------CONVERSIONS-------------------*/
		// possible conversions:		
		short byteShort = (short) byteVar; // byte -> short;			
		int shortInt = (int) shortVar; // short -> int;			
		int charInt = (int) charVar; // char -> int;			
		long intLong = (long) intVar; // int -> long;			
		double intDouble = (double) intVar; // int -> double;
		float intFloat = (float) intVar; // int -> float; (information loss)		
		float longFloat = (float) longVar; // long -> float; (information loss)

		System.out.println(
				"\n---CONVERSIONS---\n" + 
						"byte -> short: " + byteShort + "\n" +
						"short -> int: " + shortInt + "\n" +		
						"char-> int: " + charInt + "\n" +		
						"int -> long: " + intLong + "\n" +		
						"int -> double: " + intDouble + "\n" +		
						"int -> float: " + intFloat + "\n" +		
						"long -> float: " + longFloat + "\n"		
				);

		/*-------------------READING, OPERATIONS AND CONDITIONALS-------------------*/
		Scanner scannerVar = new Scanner(System.in);

		System.out.println("\n---READING, OPERATIONS AND CONDITIONALS---\n");

		System.out.print("Your name: ");
		String nameVar = scannerVar.nextLine(); // 'next()' just read one word. To read all te line, use 'nextLine()'

		char exit;
		do {
			System.out.print("Type one number: "); // 'println' jumps one line after log
			float num1Var = scannerVar.nextFloat(); // 'nextSomething' read some type of variable
			System.out.print("Type a second number: ");
			float num2Var = scannerVar.nextFloat();

			byte operationVar;
			do {
				System.out.print(
						"\nNow choose an operation: \n" + 
								"+ : 1\n" + 
								"- : 2\n" + 
								"x : 3\n" + 
								"/ : 4\n"
						);
				float resultVar = num1Var;
				operationVar = scannerVar.nextByte();

				String finalResult = "\nResult: ";
				switch (operationVar) {
				case 1:
					resultVar += num2Var;
					finalResult += String.valueOf(resultVar);
					break;

				case 2: 
					resultVar -= num2Var;
					finalResult += String.valueOf(resultVar);
					break;

				case 3: 
					resultVar *= num2Var;
					finalResult += String.valueOf(resultVar);
					break;

				case 4: 
					resultVar /= num2Var;
					finalResult += String.valueOf(resultVar);
					break;

				default:
					finalResult = "\n"+ nameVar + ", type 1, 2, 3 or 4";
				}

				System.out.println(finalResult);

			}while(operationVar < 1 || operationVar > 4);

			do {

				System.out.println("\nContinue application? (Y/N)");
				exit = scannerVar.next().trim().charAt(0);
				exit = Character.toUpperCase(exit);

			}while(exit != 'Y' && exit != 'N');

		}while(exit == 'Y');

		System.out.println("exiting application...");

		scannerVar.close(); // close the Object to lower the memory usage
	}
}
