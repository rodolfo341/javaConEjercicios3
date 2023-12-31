package S04;

import java.util.Scanner;
/**
 * 4. Sentencia Condicional
 *
 * 19. Realiza un programa que nos diga cuántos dígitos tiene un número
 * entero que puede ser positivo o negativo. Se permiten números de
 * hasta 5 dígitos.
 *
 * @author Rodolfo Aravena
 */

public class ej19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int num;
		int cifras;
		
		do {
			cifras = 1;
			System.out.println("num: "); num = sc.nextInt();
			while( num >= 10 ) {
				num /=10;
				cifras++;
			}			
			System.out.println("cifras: " + cifras);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
