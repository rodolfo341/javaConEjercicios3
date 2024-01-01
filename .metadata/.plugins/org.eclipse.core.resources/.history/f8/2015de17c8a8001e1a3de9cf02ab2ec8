package S02;
/**
* 
* Escribe un programa que calcule el total de una factura 
* a partir de la base imponible (precio sin IVA). 
* La base imponible estará almacenada en una variable.
* 
* @author Rodolfo Aravena
* 
*/
import java.util.Scanner;

public class ej06 {

	public static final double iva = 2.21;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double precioBruto = 0;
				
		do {
			System.out.println("Precio bruto: "); precioBruto = sc.nextDouble();
			
			System.out.println("Total = " + ( precioBruto * 1.21 ) );
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
		
	}

}
