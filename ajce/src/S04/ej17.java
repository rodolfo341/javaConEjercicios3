package S04;

import java.util.Scanner;
/**
 * 4. Sentencia Condicional
 *
 * 17. Escribe un programa que diga cuál es la última cifra de un número
 * entero introducido por teclado.
 *
 * @author Rodolfo Aravena
 */
public class ej17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		
		do {
				
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
