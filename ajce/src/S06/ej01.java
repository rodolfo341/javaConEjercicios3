package S06;

import java.util.Random;
import java.util.Scanner;
/**
* 
* Escribe un programa que muestre la tirada de tres dados. 
* Se debe mostrar también la suma total (los puntos que suman entre los tres dados)
*
* @author Rodolfo Aravena
*/
public class ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();		// instanciar random
		char res;
		int dado1;
		int dado2;
		int dado3;
		int suma;		
									
		do {			
			dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
            dado3 = random.nextInt(6) + 1;
            suma = dado1 + dado2 + dado3;
            
            
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("Dado 3: " + dado3);
            System.out.println("Suma: " + suma);
			
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
