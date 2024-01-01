package S04;

import java.util.Scanner;

/**
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba 
 * el correspondiente nombre del día de la semana.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int dia;
		
		do {
			do { System.out.print("numero del dia: "); dia = sc.nextInt(); } while ( dia > 7 || dia < 1 );
			
				 if ( dia == 1 ) System.out.println("\t\tnLunes");
			else if ( dia == 2 ) System.out.println("\t\tnmartes");
			else if ( dia == 3 ) System.out.println("\t\tnmiercoles");
			else if ( dia == 4 ) System.out.println("\t\tnjueves");
			else if ( dia == 5 ) System.out.println("\t\tnviernes");
			else if ( dia == 6 ) System.out.println("\t\tnsabado");
			else if ( dia == 7 ) System.out.println("\t\tndomingo");
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
