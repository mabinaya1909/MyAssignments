package week3.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingNumberInAList {

	public static void main(String[] args) {
		int[] array= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> arrayList=new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
			System.out.println(arrayList);
		}
		Collections.sort(arrayList);
		System.out.println(arrayList);
		for (int i = 0; i < arrayList.size()-1; i++) {
			if(arrayList.get(i+1)!=(arrayList.get(i))+1) {
				System.out.println(arrayList.get(i)+1);
			}
		}

	}

}
