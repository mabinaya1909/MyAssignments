package week3.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> input=new ArrayList <Integer>();
		int[] array= {3, 2, 11, 4, 6, 7};
		//to convert given array into list
		for (int i = 0; i < array.length; i++) {
			input.add(array[i]);
			System.out.println(input);
		}
		//to sort the array
		Collections.sort(input);
		System.out.println("The sorted list is"+input);
		//to get the secondlargest number index
		int secondLargestIndex = input.size()-2;
		//to print the second largest number
		int secondLargest=input.get(secondLargestIndex);
		System.out.println(secondLargest);

	}

}
