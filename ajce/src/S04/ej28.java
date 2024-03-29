package S04;

import java.util.Scanner;

/**
 * Implementa el juego piedra, papel y tijera. 
 * Primero, el usuario 1 introduce su jugada y luego el usuario 2. 
 * Si alguno de los usuarios introduce una opción incorrecta, 
 * el programa deberá mostrar un mensaje de error.
 * 
 * @author Rodolfo Aravena
 * 
 */

public class ej28 {

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

/**
 * Ejemplo 1:
 * Turno del jugador 1 (introduzca piedra, papel o tijera): papel
 * Turno del jugador 2 (introduzca piedra, papel o tijera): papel
 * 		Empate
 * 
 * Ejemplo 2:
 * Turno del jugador 1 (introduzca piedra, papel o tijera): papel
 * Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
 * 		Gana el jugador 2
 * 
 * Ejemplo 3:
 * Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
 * Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
 * 		Gana el jugador  
 */