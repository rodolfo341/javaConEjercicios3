package S04;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que pida por teclado un día de la semana y 
 * que diga qué asignatura toca a primera hora ese día.
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		String dia;
		
		do {
			dia = "x";
			while( !dia.equalsIgnoreCase("lunes")     &&!dia.equalsIgnoreCase("martes") && !dia.equalsIgnoreCase("miercoles") &&!dia.equalsIgnoreCase("jueves") &&
				   !dia.equalsIgnoreCase("viernes")   &&!dia.equalsIgnoreCase("sabado") && !dia.equalsIgnoreCase("domingo") ) {
				
				System.out.print("dia: "); dia = sc.nextLine();
				
			}
			
			switch (dia) {
				case "lunes":     {	System.out.println("Programacion del lunes"    ); break; }
				case "martes":    {	System.out.println("Programacion del martes"   ); break; }
				case "miercoles": {	System.out.println("Programacion del miercoles"); break; }
				case "jueves":    {	System.out.println("Programacion del jueves"   ); break; }
				case "viernes":   {	System.out.println("Programacion del viernes"  ); break; }
				case "sabado":    {	System.out.println("Programacion del sabado"   ); break; }
				case "domingo":   {	System.out.println("Programacion del domingo"  ); break; }	
			}
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
			sc.nextLine();
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();
	}

}
