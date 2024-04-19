package week3.Assignment;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder result= new StringBuilder();
		String test = "I am a software tester";
		String[] testArray=test.split(" ");
		 	for (int i = 0; i < testArray.length; i++) {
		 		if(i%2==1) {
		 			char[] charodd=testArray[i].toCharArray();
		 			for (int j = charodd.length-1; j >=0 ; --j) {
		 				String reverseodd=String.valueOf(charodd[j]);
		 				result.append(reverseodd);
					}
		 			
		 		}
		 		else{
	 				result.append(" ").append(testArray[i]).append(" ");
	 			}
		 		
			}
		 	System.out.println(result);
	}

}
