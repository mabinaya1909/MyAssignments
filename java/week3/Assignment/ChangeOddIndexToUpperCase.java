package week3.Assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "changeme";
		 //change the string to character array
		 char ch[]=input.toCharArray();
		 for (int i = 1; i < ch.length; i=i+2) {
				 //change the character of the index to uppercase
				ch[i]=Character.toUpperCase(ch[i]);
				
			 }
		 System.out.println(new String(ch));
		 
			 
			
			 
			
		}

	}


