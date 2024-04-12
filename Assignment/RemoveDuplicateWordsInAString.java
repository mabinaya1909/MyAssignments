package week3.Assignment;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String input="We learn Java basics as part of java sessions in java week1";
		//get the words of the string as an array
		String[] inputArray=input.split(" ");
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if(inputArray[i].equalsIgnoreCase(inputArray[j])) {
					//instead of printing the duplicate word replace it with null
					inputArray[j]="";
					count++;
				}
				
			}
			if(count>0) {
				System.out.println(inputArray[i]);
			}
		}

	}

}
