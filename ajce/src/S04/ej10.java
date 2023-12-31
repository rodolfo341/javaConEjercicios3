package S04;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que nos diga el horóscopo a 
 * partir del día y el mes de nacimiento
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		int mes;
		int dia;
							
		do {
			do {
				System.out.println("ingresa mes de nacimiento: "); mes = sc.nextInt();				
			} while ( mes < 1 || mes > 12 );
			
			if ( mes == 1 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 31);
				System.out.println("Usted nacio el " + dia + " de enero");
				if ( dia < 20 ) System.out.println("y es del signo Capricornio \n");
				else System.out.println("y es del signo Acuario \n");
			}
			
			if ( mes == 2 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 28);
				System.out.println("Usted nacio el " + dia + " de febrero");
				if ( dia < 21 ) System.out.println("y es del signo Acuario \n");
				else System.out.println("y es del signo Picis \n");
			}
			
			if ( mes == 3 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 31);
				System.out.println("Usted nacio el " + dia + " de marzo");
				if ( dia < 21 ) System.out.println("y es del signo Picis \n");
				else System.out.println("y es del signo Aries \n");
			}
			
			if ( mes == 4 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 30);
				System.out.println("Usted nacio el " + dia + " de abril");
				if ( dia < 20 ) System.out.println("y es del signo Aries \n");
				else System.out.println("y es del signo Tauro \n");
			}
			
			if ( mes == 5 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 31);
				System.out.println("Usted nacio el " + dia + " de mayo");
				if ( dia < 20 ) System.out.println("y es del signo Tauro \n");
				else System.out.println("y es del signo Geminis \n");
			}
			
			if ( mes == 6 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 30);
				System.out.println("Usted nacio el " + dia + " de junio");
				if ( dia < 20 ) System.out.println("y es del signo Geminis \n");
				else System.out.println("y es del signo Cancer \n");
			}
			
			if ( mes == 7 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 31);
				System.out.println("Usted nacio el " + dia + " de julio");
				if ( dia < 20 ) System.out.println("y es del signo Cancer \n");
				else System.out.println("y es del signo Leo \n");
			}
			
			if ( mes == 8 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 31);
				System.out.println("Usted nacio el " + dia + " de agosto");
				if ( dia < 20 ) System.out.println("y es del signo Leo \n");
				else System.out.println("y es del signo Virgo \n");
			}
			
			if ( mes == 9 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 30);
				System.out.println("Usted nacio el " + dia + " de septiembre");
				if ( dia < 20 ) System.out.println("y es del signo Virgo \n");
				else System.out.println("y es del signo Libra \n");
			}
			
			if ( mes == 10 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 31);
				System.out.println("Usted nacio el " + dia + " de octubre");
				if ( dia < 20 ) System.out.println("y es del signo Libra \n");
				else System.out.println("y es del signo Escorpion \n");
			}
			
			if ( mes == 11 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 30);
				System.out.println("Usted nacio el " + dia + " de noviembre");
				if ( dia < 20 ) System.out.println("y es del signo Escorpion \n");
				else System.out.println("y es del signo Sagitario \n");
			}
			
			if ( mes == 12 ) {
				do { System.out.println("ingrese dia"); dia = sc.nextInt(); } while ( dia < 1 || dia > 31);
				System.out.println("Usted nacio el " + dia + " de diciembre");
				if ( dia < 20 ) System.out.println("y es del signo Sagitario\n");
				else System.out.println("y es del signo Capricornio \n");
			}
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
