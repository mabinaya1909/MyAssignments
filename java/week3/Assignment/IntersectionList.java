package week3.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		int[] a={3, 2, 11, 4, 6, 7};
		int[] b= {1, 2, 8, 4, 9, 7};
		List<Integer> aList=new ArrayList<Integer>();
		List<Integer> bList=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
				aList.add(a[i]);	
			}
		for (int i = 0; i < b.length; i++){
				bList.add(b[i]);
				}
		aList.retainAll(bList);
		System.out.println(aList);

	}
		
	}


