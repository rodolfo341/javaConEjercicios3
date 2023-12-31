 package S03;

import java.util.Scanner;

/**
 *
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int KB;
		int MB;
								
		do {
			System.out.println("KB: "); KB = sc.nextInt();
			MB = KB / 1024;
			System.out.println("Los " + KB + " KB son " + MB + " MB");
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
