package S03;

import java.util.Scanner;

/**
 *
 * Escribe un programa que calcule el salario semanal de un empleado 
 * en base a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		final int valorHora = 12;
		int cantHoras;
		int sueldo;
						
		do {
			System.out.print("Cantidad de horas trabajadas: "); cantHoras = sc.nextInt();
			sueldo = cantHoras * valorHora;
			System.out.println("Sueldo = " + sueldo);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
