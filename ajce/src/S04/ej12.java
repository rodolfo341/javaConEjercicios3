package S04;

import java.util.Scanner;
/**
 * 
 * 4. Sentencia Condicional
 *
 * 12. Realiza un minicuestionario con 10 preguntas tipo test sobre las
 * asignaturas que se imparten en el curso. Cada pregunta acertada
 * sumará un punto. El programa mostrará al final la califcación
 * obtenida. Pásale el minicuestionario a tus compañeros y pídeles
 * que lo hagan para ver qué tal andan de conocimientos en las
 * diferentes asignaturas del curso.
 *
 * @author Rodolfo Aravena
 * 
 */
public class ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		char res1;
		char res2;
		char res3;
		int puntaje;
		
		do {
			puntaje = 0;
			
			System.out.println("test \n");
			
			System.out.println("¿Cuál es la capital de Canadá?");
			System.out.println("a) Toronto");
			System.out.println("b) Ottawa");
     		System.out.println("c) Vancouver");
			System.out.println("d) Montreal");
			res1 = sc.next().charAt(0);
			if ( res1 == 'b') puntaje++;
			
			System.out.println("¿Quién escribió la obra \"Don Quijote de la Mancha\"?");
			System.out.println("a) William Shakespeare");
			System.out.println("b) Miguel de Cervantes");
			System.out.println("c) Federico García Lorca");
			System.out.println("d) Gabriel García Márquez");
			res2 = sc.next().charAt(0);
			if ( res2 == 'b') puntaje++;
			
			System.out.println("¿Cuál es el océano más grande del mundo?");
			System.out.println("a) Océano Atlántico");
			System.out.println("b) Océano Índico");
			System.out.println("c) Océano Ártico");
			System.out.println("d) Océano Pacífico");
			res3 = sc.next().charAt(0);
			if ( res3 == 'b') puntaje++;
			
			System.out.println("Puntaje : " + puntaje);
			
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
