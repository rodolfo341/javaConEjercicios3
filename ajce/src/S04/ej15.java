package S04;

import java.util.Scanner;
/**
 * 
 * 4. Sentencia Condicional
 *
 * 15. Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un
 * símbolo como *, +, -, $, &, etc. El programa debe permitir al
 * usuario mediante un menú elegir si el vértice de la pirámide está
 * apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
 * derecha.
 *
 * @author Rodolfo Aravena
 * 
 */
public class ej15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res;
		char c;
		int direccion;
		
		do {
			System.out.print("caract? "); c = sc.next().charAt(0);
			System.out.println("Donde apuntará la pirámide?");
			System.out.println("\n\t1) /\\"); 			
			System.out.println("\n\t2) ->");
			System.out.println("\n\t3) \\/");
			System.out.println("\n\t4) <-");
			do {
				direccion = sc.nextInt();				
			} while ( direccion < 1 || direccion > 4 );
			
			if( direccion == 1 ) {
				System.out.println("       "+c+"        ");
				System.out.println("      "+c+" "+c+"   ");
				System.out.println("     "+c+"   "+c+"  ");
				System.out.println("    "+c+"     "+c+" ");
				System.out.println("   "+c+" "+c+" "+c+" "+c+" "+c+"");				
			}
			else if( direccion == 2 ) {
				System.out.println("   "+c+"             ");
				System.out.println("   "+c+"  "+c+"      ");
				System.out.println("   "+c+"    "+c+"    ");
				System.out.println("   "+c+"  "+c+"      ");
				System.out.println("   "+c+"             ");				
			}
			else if( direccion == 3 ) {
				System.out.println("   "+c+" "+c+" "+c+" "+c+" "+c+"");
				System.out.println("    "+c+"     "+c+" ");
				System.out.println("     "+c+"   "+c+"  ");
				System.out.println("      "+c+" "+c+"   ");
				System.out.println("       "+c+"        ");				
			}
			else {
				System.out.println("        "+c+"       ");
				System.out.println("     "+c+"  "+c+"   ");
				System.out.println("   "+c+"    "+c+"   ");
				System.out.println("     "+c+"  "+c+"   ");
				System.out.println("        "+c+"       ");				
			}
						
			System.out.print("¿Desea continuar? (S/N): "); res = sc.next().charAt(0);
		} while (Character.toUpperCase(res) == 'S');
		
		sc.close();

	}

}
