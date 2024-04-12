package week3.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAListInDescendingOrder {

	public static void main(String[] args) {
		String[] input= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> inputList=new ArrayList<String>();
		List<String> outputList=new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			inputList.add(input[i]);
		}
		Collections.sort(inputList);
		System.out.println(inputList);
		for (int i = inputList.size()-1; i >=0; --i) {
			outputList.add(inputList.get(i));
			
		}
			System.out.println(outputList);
		

	}

}
