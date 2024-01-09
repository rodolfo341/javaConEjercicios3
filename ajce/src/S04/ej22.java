package S04;

import java.util.Scanner;
/**
 * 4. Sentencia Condicional
 *
 * 22. Realiza un programa que, dado un día de la semana (de lunes a viernes) y
 * una hora (horas y minutos), calcule cuántos minutos faltan para el fin de
 * semana. Se considerará que el fin de semana comienza el viernes a las 15:00h.
 * Se da por hecho que el usuario introducirá un día y hora correctos,
 * anterior al viernes a las 15:00h.
 *
 * @author Rodolfo Aravena
 */
public class ej22 {

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
