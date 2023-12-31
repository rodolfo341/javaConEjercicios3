package S04;

import java.util.Scanner;
/**
 * 4. Sentencia Condicional
 *
 * 20. Realiza un programa que diga si un número entero positivo
 * introducido por teclado es capicúa. Se permiten números de
 * hasta 5 cifras.
 *
 * @author Rodolfo Aravena
 */
public class ej20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int num;
		int original;
		int invertido;
				
		do {
			System.out.println("num: "); num = sc.nextInt();
			original = num;
			invertido = 0;
			
			while ( num > 0 ) {
				int digito = num % 10;
				invertido = invertido * 10 + digito;
				num /= 10;
			}
			
			if ( original == invertido ) System.out.println("Capicua");
			else System.out.println("no-Capicua");
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
