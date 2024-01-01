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
							
		do {
		
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
