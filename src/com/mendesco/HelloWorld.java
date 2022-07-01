package com.mendesco;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// print in output
		System.out.println("Hello World!");

		/*-------------------DATA AND VARIABLES-------------------*/
		// integer numbers
		byte byteVar = 127; // -128 -> 127
		short shortVar = 1000; // -32,768 -> 32,767
		int intVar = 1200300; // -2,147,483,648 -> 2,147,483,647
		long longVar = 300000000; // -9,223,372,036,854,775,808 -> 9,223,372,036,854,775,807
		// decimal numbers
		float floatVar = 14.8f; // 3.40282347 x 1038 -> 1.40239846 x 10-45
		double doubleVar = 14.8290; // 1.7976931348623157 x 10308 -> 4.9406564584124654 x 10-324 | 2x more than FLOAT
		// strings
		char charVar = '0';
		String stringVar = "Vitor";
		// boolean
		boolean booleanVar = true;

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

		System.out.print("Type one number: "); // println jumps one line after log
		float num1Var = scannerVar.nextFloat(); // nextSomething read some type of variable
		System.out.print("Type a second number: ");
		float num2Var = scannerVar.nextFloat();

		System.out.print(
				"\nNow choose an operation: \n" + 
						"+ : 1\n" + 
						"- : 2\n" + 
						"x : 3\n" + 
						"/ : 4\n"
				);
		byte operationVar = scannerVar.nextByte();

		float resultVar = num1Var;
		String finalResult = "Result: ";
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
			finalResult = "Type 1, 2, 3 or 4";
		}

		System.out.println(finalResult);
	}
}
