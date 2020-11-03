package cours_2;

import java.util.Scanner;
import java.util.*;

public class exo2 {
	
	public static void palindrome() {
		
			
		
		     String original, reverse = ""; 
		     Scanner in = new Scanner(System.in); 

		     System.out.println("Entrer un mot"); 
		      original = in.nextLine(); 

		     int length = original.length(); 

		     for (int i = length - 1; i >= 0; i--) 
		     {
		     reverse = reverse + original.charAt(i); 
		     }
		     if (original.equals(reverse)) 
		     System.out.println("palindrome."); 
		     else 
		     System.out.println("pas un palindrome."); 
		     
		}	
}