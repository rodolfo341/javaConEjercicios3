package S04;

import java.util.Scanner;

/**
 * 
 * Realiza un programa que pida una hora por teclado y que 
 * muestre luego buenos días, buenas tardes o buenas noches según la hora. 
 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. 
 * Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int hora;
				
		do {
			do { System.out.print("Hora? "); hora = sc.nextInt(); } while ( hora < 0 || hora > 24 );
			
			 	 if ( hora > 20 ) System.out.println("Buenas noches"); 
			else if ( hora > 12 ) System.out.println("Buenas tardes");
			else if ( hora > 5  ) System.out.println("Buenos dias");
			else System.out.println("Zzz..");			
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
