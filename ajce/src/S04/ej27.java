package S04;

import java.util.Scanner;
/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. 
 * El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * 		.- manzana
 * 		.- fresa o 
 * 		.- chocolate. 
 * La tarta de:
 * 		.- manzana vale 18 euros y 
 * 		.- fresa 16. 
 * 		.- chocolate negro 14 euros
 * 		.- blanco 15. 
 * Por último se pregunta si se añade nata y 
 * si se personaliza con un nombre; 
 * 		.- la nata suma 2.50 y 
 * 		.- el nombre 2.75.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int sabor;
		int tipoChocolate;
								
		do {			
			System.out.println("Elija un sabor:");
			System.out.println("1) manzana");
			System.out.println("2) fresa");
			System.out.println("3) chocolate");
			do { tipoChocolate = sc.nextInt(); } while ( tipoChocolate < 1 || tipoChocolate > 2 );
			
			
			System.out.println("¿Qué tipo de chocolate quiere?");
			System.out.println("1) negro");
			System.out.println("2) blanco");
			do { sabor = sc.nextInt(); } while ( sabor < 1 || sabor > 3 );
			
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
/**
 * Ejemplo 1:
 * 		Elija un sabor (manzana, fresa o chocolate): chocolate
 * 		¿Qué tipo de chocolate quiere? (negro o blanco): negro
 * 		¿Quiere nata? (si o no): si
 * 		¿Quiere ponerle un nombre? (si o no): no
 * 			Tarta de chocolate negro: 14,00 €
 * 			Con nata: 2,50 €
 * 			Total: 16,50 €
 *
 * Ejemplo 2:
 * 		Elija un sabor (manzana, fresa o chocolate): manzana
 * 		¿Quiere nata? (si o no): no
 * 		¿Quiere ponerle un nombre? (si o no): si
 * 			Tarta de manzana: 18,00 €
 * 			Con nombre: 2,75 €
 * 			Total: 20,75
 *
 * Ejemplo 3:
 * 		Elija un sabor (manzana, fresa o chocolate): fresa
 * 		¿Quiere nata? (si o no): si
 * 		¿Quiere ponerle un nombre? (si o no): si
 * 			Tarta de fresa: 16,00 €
 * 			Con nata: 2,50 €
 * 			Con nombre: 2,75 €
 * 			Total: 21,25 €
 * */






