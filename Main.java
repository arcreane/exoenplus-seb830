package cours_2;

import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) {
		
			int choice= 0;
			System.out.println("Quel jeu choisissez vous?");
			System.out.println("1 - Deviner un nombre");
			System.out.println("2 - Palindrome");
			System.out.println("3 - jeu des tableaux");
			do {
				
			Scanner Menu = new Scanner(System.in);
			 choice = Menu.nextInt();
			
			if(choice == 1) {
				exo1.nombre();
			}else if(choice == 2) {
				exo2.palindrome();
			}
		}while(choice != 1 || choice != 2 || choice == 3) ;	
			
	}
}	
		
	
