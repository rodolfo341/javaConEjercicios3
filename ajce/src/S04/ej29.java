package S04;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el precio de un desayuno. 
 * El programa preguntará primero 
 * qué ha tomado el usuario de comer: 
 * 			.- palmera ( 1.40 € )
 * 			.- donut ( 1 € )
 * 			.- pitufo
 * 				.- con aceite ( 1’20 € )
 * 				.- con tortilla ( 1’60 € )
 * la bebida: 
 * 			.- zumo ( 1’50 )
 * 			.- café ( 1’20 )
 * 
 * @author Rodolfo Aravena
 * 
 */

public class ej29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
						
		do {			
			
			
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}

/**
 * 
 * Ejemplo 1:
 * 			¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
 * 			¿Qué ha tomado de beber? (zumo o café): café
 * 			Palmera: 1,40 €
 * 			Café: 1,20 €
 * 			Total desayuno: 2,60 €
 * 
 * Ejemplo 2:
 * 			¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
 * 			¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
 * 			¿Qué ha tomado de beber? (zumo o café): zumo
 * 			Pitufo con tortilla: 1,60 €
 * 			Zumo: 1,50 €
 * 			Total desayuno: 3,10 €
 * 
 */
