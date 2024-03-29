package S04;

import java.util.Scanner;
/**
 * 4. Sentencia Condicional
 *
 * 22. Realiza un programa que, dado un día de la semana (de lunes a viernes) y
 * una hora (horas y minutos), calcule cuántos minutos faltan para el fin de
 * semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
 * Se da por hecho que el usuario introducirá un día y hora correctos,
 * anterior al viernes a las 15:00h.
 *
 * @author Rodolfo Aravena
 */
public class ej22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int dia;
		int minutosDia = 24 * 60;
		int minutosViernes =15 * 60;
		int minutosTotales = minutosDia * 4 + minutosViernes;
		int cuantosMinutosVan;
		int diaDeLaSemana;
		int hora;
		int minutosHastaElFinDeSemana;
		
		System.out.println("minutosDia = " + minutosDia);
		System.out.println("minutosViernes = " + minutosViernes);
		System.out.println("minutosTotales = " + minutosTotales);
		
		do {
			cuantosMinutosVan = 0;
			dia = 1;
			System.out.println("ingrese dia de la semana");
			System.out.println("1) Lunes");
			System.out.println("2) Martes");
			System.out.println("3) Miercolas");
			System.out.println("4) Jueves");
			System.out.println("5) Viernes");
			do {
				diaDeLaSemana = sc.nextInt();				
			} while( diaDeLaSemana < 1 || diaDeLaSemana > 5 );
			
			if ( diaDeLaSemana == 1 ) cuantosMinutosVan = 0;
			else if ( diaDeLaSemana == 2 ) cuantosMinutosVan = minutosDia;
			else if ( diaDeLaSemana == 3 ) cuantosMinutosVan = minutosDia * 2;
			else if ( diaDeLaSemana == 4 ) cuantosMinutosVan = minutosDia * 3;
			else if ( diaDeLaSemana == 5 ) cuantosMinutosVan = minutosDia * 4;
			
			if ( dia == 5 ) {
				do {
					System.out.println("ingrese hora del dia: "); hora = sc.nextInt(); 
				} while( hora < 1 || hora > 15 );
			} else {
				do {
					System.out.println("ingrese hora del dia: "); hora = sc.nextInt();						
				} while( hora < 1 || hora > 24 );				
			}
			cuantosMinutosVan = cuantosMinutosVan + hora * 60;
			System.out.println("cuantosMinutosVan: " + cuantosMinutosVan);
			minutosHastaElFinDeSemana = minutosTotales - cuantosMinutosVan;
			System.out.println("minutosHastaElFinDeSemana: " + minutosHastaElFinDeSemana);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
