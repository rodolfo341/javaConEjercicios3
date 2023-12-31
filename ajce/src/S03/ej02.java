package S03;

import java.util.Scanner;

/**
 *
 * Realiza un conversor de pesos a dolares. 
 * La cantidad de pesos que se quiere convertir debe ser introducida 
 * por teclado.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double pesos;
		double dolar;
		
		do {
			System.out.print("pesos: "); pesos = sc.nextDouble();
			dolar = pesos / 873.780;
			System.out.println("$" + pesos + " = " + " $" + dolar + " dolares");
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
