package S04;

import java.util.Scanner;

/**
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior 
 * para considerar las horas extras. 
 * Escribe un programa que calcule el salario semanal de un trabajador 
 * teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) 
 * se pagan a 12 euros la hora. A partir de la hora 41, 
 * se pagan a 16 euros la hora.
 * 
 * Ejemplo 1:
 * 			Por favor, introduzca el número de horas trabajadas durante la semana: 36
 * 			El sueldo semanal que le corresponde es de 432 euros
 * 
 * Ejemplo 2:
 * 			Por favor, introduzca el número de horas trabajadas durante la semana: 40
 * 			El sueldo semanal que le corresponde es de 480 euros
 * 
 * Ejemplo 3:
 * 			Por favor, introduzca el número de horas trabajadas durante la semana: 55
 * 			El sueldo semanal que le corresponde es de 720 euros
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int horas;
						
		do {
			horas = 0;
			do {
				System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: "); 
				horas = sc.nextInt();				
			} while ( horas <= 0 );
			
			if ( horas <= 40 ) horas *= 12;
			else horas = 40 * 12 + ( ( horas - 40 ) * 16 );
			
			System.out.println("El sueldo semanal que le corresponde es de " + horas + " euros");
			
			
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
