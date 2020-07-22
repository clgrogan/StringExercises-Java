package com.stringexercises;

import java.util.Arrays;
import java.util.Scanner;

public class RegExRemoveCharacters {
//	Exercise to Implement console program which meet the following requirements:
//		1.	Program starts and asks user to input any text.
//		2.	Return array of the text entered using Scanner object.
//		3.	Program prints array of words (using Arrays.toString(arr)) entered by 
//			user without any spaces or punctuation marks
//		4.	Use a regular expression to perform the action on the array.
	public static void main(String[] args) {
//		String str= "This#string%contains^special*characters&.";
//		str = str.replaceAll("[^a-zA-Z0-9]", " ");
//		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		System.out.print("You entered these words: ");
		
// 		The regular expression splits where any punctuation 'p{P}' 
//			or spaces 's' occur either alone or in multiples.
//			the '+' plus makes the expression use alone or multiples.
		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));
		
//		The following will split at space or multiple spaces.
		System.out.println(Arrays.toString(userInput.split("[\\s]+")));
		
//		The following will split at space.
		System.out.println(Arrays.toString(userInput.split("[\\s]")));
		
//		The following will split at single punctuation only.
		System.out.println(Arrays.toString(userInput.split("[\\p{P}]")));
	}

}
