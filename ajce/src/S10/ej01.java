package S10;

import java.util.Scanner;
/**
* 
* Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
* muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
* todo el ArrayList sin usar ningún índice
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
