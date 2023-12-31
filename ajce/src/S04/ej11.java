package S04;

import java.util.Scanner;
/**
 * 
 * 4. Sentencia Condicional
 *
 * 11. Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Rodolfo Aravena
 * 
 */
public class ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int segundosDia = 86400;
		int hora;
		int minutos;
		int totalSegundos;
		int faltan;
								
		do {
			System.out.println("Hora: "); hora = sc.nextInt();
			System.out.println("minutos: "); minutos = sc.nextInt();
			totalSegundos = ( minutos * 60 ) + ( hora * 60 * 60 );
			faltan = segundosDia - totalSegundos;
			System.out.println("Faltan " + faltan + " segundos para medianoche");
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
