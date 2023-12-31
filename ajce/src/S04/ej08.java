package S04;

import java.util.Scanner;

/**
 * 
 * Amplía el programa anterior para que diga la nota del boletín 
 * (insuficiente,suficiente, bien, notable o sobresaliente).
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double a, b, c, media;
		
		do {
			do { System.out.println("a: "); a = sc.nextDouble(); } while ( a < 1.0 || a > 7.0 );
			do { System.out.println("b: "); b = sc.nextDouble(); } while ( b < 1.0 || b > 7.0 );
			do { System.out.println("c: "); c = sc.nextDouble(); } while ( c < 1.0 || c > 7.0 );
			
			media = (a + b + c) / 3;
			
			if ( media >= 6.5 ) {
				System.out.println("Sobresaliente");
			} else if ( media >= 6.0 ) {
				System.out.println("notable");
			} else if ( media >= 5.0 ) {
				System.out.println("bien");
			} else if ( media >= 4.0 ) {
				System.out.println("suficiente");
			} else {
				System.out.println("insuficiente");
			}
			
			System.out.println("media: " + media);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
