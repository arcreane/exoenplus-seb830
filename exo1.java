package cours_2;

import java.util.Scanner;

public class exo1{

		public static void nombre() {
			
		int nombre = 1 + (int)(Math.random() * ((100 - 1) + 1));
		int essai = 10;
		boolean playing = true;
		
		
		while(playing) {
		do{
		System.out.println("Deviner un nombre entre 1 et 100 - Vous avez " + essai + " essais");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
	
		if(choice == nombre) {
			System.out.println("Vous avez trouvé le nombre : " + nombre);
		}
		else if(choice < nombre){
			System.out.println("C'est trop petit");
			
		}
		else if(choice > nombre) {
			System.out.println("C'est trop grand");
		}
		
		essai--;	
		
		
	}while(essai != 0);
	System.out.println("Vous n'avez plus d'essai, c'est perdu");
	playing = false;
	
		
		}
	}

}
