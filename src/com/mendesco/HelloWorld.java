package com.mendesco;

public class HelloWorld {
	public static void main(String[] args) {
		// print in output
		System.out.println("Hello World!");
		// data and variables
		// integer numbers
		byte verySmallRange = 127; // -128 -> 127
		short smallRange = 1000; // -32,768 -> 32,767
		int mediumRange = 1200300; // -2,147,483,648 -> 2,147,483,647
		long longRange = 300000000; // -9,223,372,036,854,775,808 -> 9,223,372,036,854,775,807
		// decimal numbers
		float lessAccurate = 14.8f; // 3.40282347 x 1038 -> 1.40239846 x 10-45
		double moreAccurate = 14.8290; // 1.7976931348623157 x 10308 -> 4.9406564584124654 x 10-324 | 2x more than FLOAT
		// strings
		char oneLetter = 'V';
		String moreLetters = "Vitor";
		// boolean
		boolean trueOrFalse = true;
		
		System.out.println(
				"---NUMBERS---\n" + 
				"byte: " + verySmallRange + " (very small range)\n" + 
				"short: " + smallRange + " (small range)\n" + 
				"int: " + mediumRange + " (medium range)\n" + 
				"long: " + longRange + " (long range)\n" +
				"float: " + lessAccurate + " (decimal - less accuracy)\n" + 
				"double: " + moreAccurate + " (decimal - more accuracy)\n" + 
				"\n" + 
				"---STRINGS---\n" + 
				"char: " + oneLetter + " (just one letter)\n" + 
				"String: " + moreLetters + " (more letters)\n" + 
				"\n" +
				"---BOOL---\n" + 
				"boolean: " + trueOrFalse + " (boolean: true ? false)\n"
				);
	}
}
