package S08;

import java.util.Scanner;
/**
* 
** Crea una biblioteca de funciones matemáticas que contenga las siguientes
* funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
* Observa bien lo que hace cada función ya que, si las implementas en el orden
* adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
* resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
* implementar teniendo esPrimo.
* 
* 1. esCapicua: 
* 		Devuelve verdadero si el número que se pasa como parámetro es capicúa y 
* 		falso en caso contrario.
* 
* 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
* es primo y falso en caso contrario.
* 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
* se pasa como parámetro.
* 4. potencia: Dada una base y un exponente devuelve la potencia.
* 5. digitos: Cuenta el número de dígitos de un número entero.
* 6. voltea: Le da la vuelta a un número.
* 7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
* Se empieza contando por el 0 y de izquierda a derecha.
* 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
* dentro de un número entero. Si no se encuentra, devuelve -1.
* 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
* derecha).
* 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
* izquierda).
* 11. pegaPorDetras: Añade un dígito a un número por detrás.
* 12. pegaPorDelante: Añade un dígito a un número por delante.
* 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
* dentro de un número y devuelve el trozo correspondiente.
* 14. juntaNumeros: Pega dos números para formar uno.
* 
* @author Rodolfo Aravena
* 
*/
public class ej01 {
	
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		char res;
		boolean salir = false;
		int opcion;
		int numero;
		
		while(!salir){
            
		    System.out.println("1. Opcion 1");
	        System.out.println("2. Opcion 2");
	        System.out.println("3. Opcion 3");
	        System.out.println("4. Salir");
	            
	        System.out.println("Escribe una de las opciones");
	        opcion = scanner.nextInt();
	         
	        switch(opcion){
		        case  1: System.out.println(" Capicua 1) ");
		        	System.out.println("Numero: "); numero = scanner.nextInt();
		        	if (esCapicua(numero)) System.out.println("Es Capicua");
		        	else System.out.println("No es capicua");
		        	break;
		        	
		        case  2: System.out.println("  2) "); break;
		        case  3: System.out.println("  3) "); break;
		        case  4: System.out.println("  4) "); break;
		        case  5: System.out.println("  5) "); break;
		        case  6: System.out.println("  6) "); break;
		        case  7: System.out.println("  7) "); break;
		        case  8: System.out.println("  8) "); break;
		        case  9: System.out.println("  9) "); break;
		        case 10: System.out.println(" 10) "); break;
		        case 11: System.out.println(" 11) "); break;
		        case 12: System.out.println(" 12) "); break;
		        case 13: System.out.println(" 13) "); break;
		        case 14: System.out.println(" 14) "); break;
		        case 15: System.out.println(" 15) "); break;
		        case 16: System.out.println(" 16) Salir "); 
		     			salir = true; 
		       			System.out.println("Chaoooo...");
		       			break;    
	       }	
		}
		scanner.close();
	}
	
	public static boolean esCapicua(int numero) {        
        String strNumero = Integer.toString(numero);      
        int longitud = strNumero.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (strNumero.charAt(i) != strNumero.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

	
	
}
