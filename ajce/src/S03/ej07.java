package S03;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que calcule el total de una factura 
 * a partir de la base imponible.
 *
 * @author Rodolfo Aravena
 * 
 */
public class ej07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		final double IVA = 1.21;
		double bruto;
		double total;
		
		do {
			System.out.println("bruto = "); bruto = sc.nextDouble();
			total = bruto * IVA;
			System.out.println("El precio total es : " + total);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
