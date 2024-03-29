package S04;

import java.util.Scanner;

/**
 *
 * La tienda online BanderaDeEspaña.es
 * vende banderas personalizadas de la máxima calidad y 
 * nos ha pedido hacer un configurador que calcule el precio según: 
 * 		.- el alto y 
 * 		.- el ancho. 
 * El precio base de una bandera es: 
 * 		.- Un céntimo de euro el centímetro cuadrado. 
 * Si la queremos con un escudo bordado, 
 * 		.- ( 2.50 € )  
 * Los gastos de envío son 
 * 		.- ( 3.25 €. ) 
 * El IVA ya está incluido en todas las tarifas.
 *
 * @author Rodolfo Aravena
 * 
 */

public class ej25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double alto;
		double ancho;
		double centimetrosCuadrados;
		double precioCC;
		double precioMasEscudo;
		char escudo;
		final double envio = 3.25;
						
		do {			
			System.out.println("alto: "); alto = sc.nextDouble();
			System.out.println("alto: "); ancho = sc.nextDouble();
			centimetrosCuadrados = alto * ancho;
			precioCC = centimetrosCuadrados /100;
			
			do {
				System.out.println("escudo (S) i / (N)o: "); escudo = Character.toUpperCase(sc.next().charAt(0));;				
			} while ( Character.toUpperCase(escudo) != 'S' && Character.toUpperCase(escudo) != 'N');
						
			System.out.println("Gracias. Aquí tiene el desglose de su compra.");
			System.out.println("Bandera de " + centimetrosCuadrados  + "cm2: " + precioCC  + "€");
			
			if ( escudo == 'S')	{
				precioCC += 2.5;
				System.out.println("Con escudo: 2.50 €");
			} else {
				System.out.println("Sin escudo: 0,00 €");
			}
			System.out.println("Gastos de envío: 3,25 €");
			System.out.println("Total: " + (precioCC + 3.25)  + "€");
			
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}

/**
 * Ejemplo 1:
 * Introduzca la altura de la bandera en cm: 20
 * Ahora introduzca la anchura: 35
 * ¿Quiere escudo bordado? (s/n): n
 * Gracias. Aquí tiene el desglose de su compra.
 * 		Bandera de 700 cm2: 7,00 €
 * 		Sin escudo: 0,00 €
 * 		Gastos de envío: 3,25 €
 * 		Total: 10,25 €
 * 
 * Ejemplo 2:
 * Introduzca la altura de la bandera en cm: 10
 * Ahora introduzca la anchura: 15
 * ¿Quiere escudo bordado? (s/n): s
 * Gracias. Aquí tiene el desglose de su compra.
 * 		Bandera de 150 cm2: 1,50 €
 * 		Con escudo: 2,50 €
 * 		Gastos de envío: 3,25 €
 * 		Total: 7,25 €
**/
