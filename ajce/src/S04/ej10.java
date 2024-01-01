package S04;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que nos diga el horóscopo a 
 * partir del día y el mes de nacimiento
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
							
		do {
		
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
