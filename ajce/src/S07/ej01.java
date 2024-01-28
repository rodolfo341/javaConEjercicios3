package S07;

import java.util.Scanner;
/**
 * 
 * 1. Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que
 * no han sido inicializados?
 * Posición 0   1 2 3  4 5 6  7 8 9   10   11
 * Valor    39 -2      0   14   5 120
 * 
 *
 * @author Rodolfo Aravena
 */
public class ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int arreglo[] = new int[12];
									
		do {			
			arreglo[0] = 39;
			arreglo[1] = -2;
			arreglo[4] = 0;
			arreglo[6] = 14;
			arreglo[8] = 5;
			arreglo[9] = 120;
			
			for (int i : arreglo) {
				System.out.println(i);
			}
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
