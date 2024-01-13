package S04;

import java.util.Scanner;
/**
 *
 * 21. Calcula la nota de un trimestre de la asignatura Programación. 
 * El programa pedirá: 
 * 		las dos notas qu ha sacado el alumno en los dos primeros controles.
 * 		Si la media de los dos controles da un número mayor o igual a 5, 
 * 			el alumno está aprobado y se mostrará la media. 
 * 		En caso de que la media sea un número menor que 5, 
 * 			el alumno habrá tenido que hacer el examen de recuperación que
 * 			se califica como apto o no apto, 
 * 			por tanto se debe preguntar al usuario
 * 			¿Cuál ha sido el resultado de la recuperación? (apto/no apto). 
 * 				Si el resultado de la recuperación es apto, la nota será un 5; 
 * 				en caso contrario, se mantiene la nota media anterior.
 *
 * Ejemplo 1:
 * Nota del primer control: 7
 * Nota del segundo control: 10
 * Tu nota de Programación es 8.5
 *
 * Ejemplo 2:
 * Nota del primer control: 6
 * Nota del segundo control: 3
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
 * Tu nota de Programación es 5
 *
 * @author Rodolfo Aravena
 */
public class ej21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double nota1;
		double nota2;
		double promedio;		
		char recuperativa;
						
		do {
			do { System.out.println("nota 1: "); nota1 = sc.nextDouble(); } while (nota1 < 1.0 || nota1 > 10.0);
			do { System.out.println("nota 2: "); nota2 = sc.nextDouble(); } while (nota2 < 1.0 || nota2 > 10.0);
			promedio = ( nota1 + nota2 ) / 2;
			
			if ( promedio >= 5.0 ) {
				System.out.println("Aprobado con nota: " + promedio);
			} else {
				
				do {
					System.out.println("recuperstiva: (a)pto / (n)o apto"); recuperativa = Character.toUpperCase(sc.next().charAt(0));			
				} while (recuperativa != 'A' && recuperativa != 'N');
			}
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
