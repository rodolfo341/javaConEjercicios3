package S03;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int alto;
		int ancho;
		int area;
		
		do {
			System.out.println("Alto = "); alto = sc.nextInt();
			System.out.println("Ancho = "); ancho = sc.nextInt();
			area = (alto * ancho) / 2;
			System.out.println("El area es: " + area);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
