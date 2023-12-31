package S02;
/**
* 
* Realiza un conversor de dolares a pesos. 
* La cantidad en dolares que se quiere convertir 
* deberá estar almacenada en una variable
* 
* @author Rodolfo Aravena
* 
*/
import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double pesos = 0;
		
		do {
			System.out.println("pesos: "); pesos = sc.nextDouble();
			
			System.out.println("los $" + pesos + " equivalen a " + "$" + (875.72 * pesos ) );		
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
