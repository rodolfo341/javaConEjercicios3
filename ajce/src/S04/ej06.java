package S04;

import java.util.Scanner;

/**
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto 
 * desde una altura h. Aplica la fórmula 
 * t = √ 2h/g
 * siendo g = 9.81m/s2
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej06 {

	public static final double g = 9.81;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		double t;
		double h;
				
		do {
			System.out.print("h: "); h = sc.nextDouble();
			t = Math.sqrt( (2 * h) / g );
			System.out.println("t= " + t + "s");
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
