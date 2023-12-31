package S03;

import java.util.Scanner;

/**
 *
 * Realiza un programa que calcule la nota que hace falta sacar 
 * en el segundo examen de la asignatura Programación 
 * para obtener la media deseada. Hay que tener en cuenta que 
 * la nota del primer examen cuenta el 40% y la del segundo examen un 60%.
 * 
 *  	Ejemplo 1:
 *  	Introduce la nota del primer examen: 7
 *  	¿Qué nota quieres sacar en el trimestre? 8.5
 *  	Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
 *  
 *  	Ejemplo 2:
 *  	Introduce la nota del primer examen: 8
 *  	¿Qué nota quieres sacar en el trimestre? 7
 *  	Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen
 *  
 * @author Rodolfo Aravena
 * 
 */
public class ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		
		double NPE;
		double NSE;
		double ND;
		
		do {
			System.out.print("Introduce la nota del primer examen: "); NPE = sc.nextDouble();
			System.out.print("¿Qué nota quieres sacar en el trimestre? "); ND = sc.nextDouble();
			
			NPE = NPE * 0.4;
			NSE = ( ND - NPE ) / 0.6;
			
			System.out.println("Para tener un " + ND + " en el trimestre necesitas sacar un " +  NSE  + " en el segundo examen");
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
