package S04;

import java.util.Scanner;
/**
 *
 * Capítulo 4. Sentencia condicional.
 *
 * Escribe un programa que calcule el precio final de un producto 
 * según:
 * 		 	.- su base imponible (precio antes de impuestos), 
 * 			.- el tipo de IVA aplicado (general, reducido o superreducido) y 
 * 			.- el código promocional. 
 * Los tipos de IVA: 
 * 			.- genera ( 21% )
 * 			.- reducido ( 10% )
 * 			.- superreducido ( 4% )
 * Los códigos promocionales pueden ser 
 * 			.- nopro ( no se aplica promoción )
 * 			.- mitad ( el precio se reduce a la mitad )
 * 			.- meno5 ( se descuentan 5 euros )
 * 			.- 5porc ( se descuenta el 5% )
 * El ejercicio se da por bueno si se muestran los valores correctos, 
 * aunque los números no estén tabulados.
 *
 * Ejemplo:
 * 			Introduzca la base imponible: 25
 * 			Introduzca el tipo de IVA (general, reducido o superreducido): reducido
 * 			Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
 * 			Base imponible 25.00
 * 			IVA (10%) 2.50
 * 			Precio con IVA 27.50
 * 			Cód. promo. (mitad): -13.75
 * 			TOTAL 13.75
 *
 * @author Rodolfo Aravena
 */
public class ej23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double baseImponible;
		int eleccionIVA;
		int eleccionCodigoPromocional;
		double IVA;
		double codigoPromocional;
						
		do {
			System.out.println("Introduzca la base imponible:");
			baseImponible = sc.nextInt();
			do {
				System.out.println("Introduzca el tipo de IVA:");
				System.out.println("1) General");
				System.out.println("2) Reducido");
				System.out.println("3) Superreducido");
			 	eleccionIVA = sc.nextInt();		
			} while ( eleccionIVA < 1 || eleccionIVA > 3 );
			if ( eleccionIVA == 1 ) IVA = 21;
		 	else if ( eleccionIVA == 2 ) IVA = 10;
		 	else IVA = 4;
			do {
				System.out.println("Introduzca el código promocional:");
				System.out.println("1) nopro");
				System.out.println("2) mitad");
				System.out.println("3) meno5");
				System.out.println("4) 5porc");				
				eleccionCodigoPromocional = sc.nextInt();
			} while ( eleccionCodigoPromocional < 1 || eleccionCodigoPromocional > 4 );
			if ( eleccionCodigoPromocional == 1 ) codigoPromocional = 0;
			else if ( eleccionCodigoPromocional == 2 ) codigoPromocional = 0;
			else if ( eleccionCodigoPromocional == 3 ) codigoPromocional = 0;
			else codigoPromocional = 0;
			
			
			     
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
