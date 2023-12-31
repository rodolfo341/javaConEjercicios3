package S03;

import java.util.Scanner;

/**
 * 
 * Realiza un conversor de euros a pesetas. 
 * La cantidad de euros que se quiere convertir debe ser 
 * introducida por teclado.
 * @author Rodolfo Aravena
 * 
 */
public class ej03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double pesos;
		double dolar;
						
		do {
			System.out.print("dolares: "); dolar = sc.nextDouble();
			pesos = dolar *  874.31;
			System.out.println("$" + dolar + " dolar = " + " $" + pesos + " pesos");
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
