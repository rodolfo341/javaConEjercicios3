package S09;

import java.util.Scanner;
/**
* 
* ¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas
* instancias de esta clase
*
* @author Rodolfo Aravena
*/
public class ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
									
		do {			
				
			
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
