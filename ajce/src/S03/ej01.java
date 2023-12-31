package S03;

import java.util.Scanner;

/**
 * 
 * Realiza un programa que pida dos números y 
 * luego muestre el resultado de su multiplicación
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int x = 0;
		int y = 0;
		int suma = 0;
						
		do {
			System.out.print("x= ") ;x = sc.nextInt();
			System.out.print("y= ") ;y = sc.nextInt();
			suma = x + y;
			System.out.println(x + " + " + y + " = " + suma);
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
