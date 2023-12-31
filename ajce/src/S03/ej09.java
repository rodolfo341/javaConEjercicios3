package S03;

import java.util.Scanner;

/**
 *
 * Escribe un programa que calcule el volumen de un cono según la fórmula 
 * V = 3 πr2h
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double V;
		double r;
		double h;
		double volumen;
						
		do {
			System.out.println("radio "); r = sc.nextDouble();
			System.out.println("altura "); h = sc.nextDouble();
			volumen = 1.0/3.0 * Math.PI * Math.pow(r , 2) * h;
			System.out.println("Volumen = " + volumen);
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
