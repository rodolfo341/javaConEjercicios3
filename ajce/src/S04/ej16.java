package S04;

import java.util.Scanner;
/**
 *
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. 
 * El programa irá haciendo preguntas que el usuario contestará con una 
 * v (verdadero)
 * f (falso). 
 * Cada pregunta contestada con v sumará 3 puntos.
 * Las preguntas contestadas con f no suman puntos. 
 * Utiliza el fichero test_infidelidad.txt para obtener las preguntas y las
 * conclusiones del programa.
 *
 * @author Rodolfo Aravena
 *
 */
public class ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		
		do {
			System.out.println("Test de infidelidade");
			
			System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aprarente.");
			System.out.println("(v)erdadero o (f)also");
			
			
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
