package S04;

import java.util.Scanner;
/**
 * 
 * 4. Sentencia Condicional
 *
 * 14. Realiza un programa que diga si un número introducido por teclado
 * es par y/o divisible entre 5.
 *
 * @author Rodolfo Aravena
 * 
 */ 
public class ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int num;
								
		do {
			System.out.println(); num = sc.nextInt();
			if ( num % 5 == 0 ) System.out.println("es divisible por 5");
			else System.out.println("no es divisible por 5");
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
