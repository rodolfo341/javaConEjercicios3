package S07;

import java.util.Scanner;
/**
* 
* Define un array de números enteros de 3 filas por 6 columnas con nombre num
* y asigna los valores según la siguiente tabla. Muestra el contenido de todos
* los elementos del array dispuestos en forma de tabla como se muestra en la
* figura.
*
* @author Rodolfo Aravena
*/
public class ej01 {

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
