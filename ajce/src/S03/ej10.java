package S03;

import java.util.Scanner;

/**
 * 
 * Realiza un conversor de Mb a Kb.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int MB;
		int KB;
								
		do {
			System.out.println("MB"); MB = sc.nextInt();
			KB = MB * 1024;
			System.out.println("Los " + MB + " MB son " + KB + " KB");
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
