package com.mendesco;

public class HelloWorld {
	public static void main(String[] args) {
		// print in output
		System.out.println("Hello World!");
		// data and variables
		// integer numbers
		byte verySmallRange; // -128 -> 127
		short smallRange; // -32,768 -> 32,767
		int mediumRange; // -2,147,483,648 -> 2,147,483,647
		long longRange; // -9,223,372,036,854,775,808 -> 9,223,372,036,854,775,807
		// decimal numbers
		float lessAccurate; // 3.40282347 x 1038 -> 1.40239846 x 10-45
		double moreAccurate; // 1.7976931348623157 x 10308 -> 4.9406564584124654 x 10-324 | 2x more than FLOAT
		// strings
		char oneLetter;
		String moreLetters;
		// boolean
		boolean trueOrFalse;
	}
}
