package com.mendesco;

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
				"\n---NUMBERS---\n" + 
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
	}
}
