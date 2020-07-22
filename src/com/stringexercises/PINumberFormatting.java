package com.stringexercises;

public class PINumberFormatting {
//Exercise instructions:
//	Implement console program which meet the following requirements:
//		1.	Program starts and prints Math.PI five times in console output
//		2.	The first Math.PI contains only one fraction digit
//		3.	The second Math.PI contains two fraction digits
//		4.	The third time Math.PI contains three fraction digits
//		5.	The fourth time Math.PI contains four fraction digits
//		6.	The fifth time Math.PI contains five fraction digits
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++ ) {
			System.out.println(String.format("%." + i + "f", Math.PI));
		}

	}

}
