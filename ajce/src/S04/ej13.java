

package S04;

import java.util.Scanner;
/**
 * 
 * 4. Sentencia Condicional
 *
 * 13. Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Rodolfo Aravena
 * 
 */

public class ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int a,b,c;
		int t;	
											
		do {
			System.out.print("a: "); a = sc.nextInt();
	        System.out.print("b: ");b = sc.nextInt();
	        System.out.print("c: "); c = sc.nextInt();
	        
	        if (a > b) {
	            t = a;
	            a = b;
	            b = t;
	        }

	        if (b > c) {
	            t = b;
	            b = c;
	            c = t;
	        }

	        if (a > b) {
	            t = a;
	            a = b;
	            b = t;
	        }
			
	        System.out.println("Números ordenados: " + a + " " + b + " " + c);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

	
	
	/*https://www.xvideos.com/video32668203/asiatico_tren_se_burlan_de*/
	/*https://la.spankbang.com/7e9ny/video/big+boobs+asian+on+train?*/
}
