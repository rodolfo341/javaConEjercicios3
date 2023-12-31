package S03;

import java.util.Scanner;

/**
 *
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double x;
		double y;
		char operador;
		
		do {
			System.out.print("x = "); x = sc.nextDouble();
			
			do { System.out.print("  ( + - * / ) "); operador = sc.next().charAt(0); 
			} while ( operador != '+' && operador != '-' && operador != '*' && operador != '/');
			
			System.out.print("y = "); y = sc.nextDouble();
			
			     if ( operador == '+') System.out.println( x + " + " + y + " = " + ( x + y ) );
			else if ( operador == '-') System.out.println( x + " - " + y + " = " + ( x - y ) );
			else if ( operador == '*') System.out.println( x + " * " + y + " = " + ( x * y ) );
			else if ( operador == '/') System.out.println( x + " / " + y + " = " + ( x / y ) );
							
			System.out.println("");
				
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
