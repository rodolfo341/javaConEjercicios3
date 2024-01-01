package S04;

import java.util.Scanner;

/**
 * 
 * Realiza un programa que resuelva una ecuación de primer grado 
 * (del tipo ax+b = 0).
 * 
 * Ejemplo 1:
 * 		Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
 * 		Por favor, introduzca el valor de a: 2
 * 		Ahora introduzca el valor de b: 1
 * 		x = -0.5
 * 
 * Ejemplo 2:
 * 		Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
 * 		Por favor, introduzca el valor de a: 0
 * 		Ahora introduzca el valor de b: 7
 * 		Esa ecuación no tiene solución real.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double a;
		double b;
		double x;;
		
		
		do {
			System.out.print("\nEste programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
			System.out.print("\nPor favor, introduzca el valor de a:"); a = sc.nextDouble();
			System.out.print("\nAhora introduzca el valor de b:"); b = sc.nextDouble();
			
			if ( a == 0) System.out.println("Esa ecuación no tiene solución real.");
			else {
				x = (-b) / a;
				System.out.println("x = " + x);
			}
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	
	}

}
