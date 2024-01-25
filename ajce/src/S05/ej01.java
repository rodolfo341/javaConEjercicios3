package S05;

import java.util.Scanner;

/**
* 
* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
*
* @author Rodolfo Aravena
*/
public class ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
									
		do {			
			for (int i = 1 ; i <= 100; i++) {
				System.out.println( 5 + " * " + i + " = " + (5 * i ) );		
			}
				
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
