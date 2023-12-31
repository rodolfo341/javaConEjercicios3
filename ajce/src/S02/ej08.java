package S02;
/**
* 
* Escribe un programa que declare 5 variables de tipo char. 
* A continuación, crea otra variable como cadena de caracteres y 
* asígnale como valor la concatenación de las anteriores 5 variables. 
* Por último, muestra la cadena de caracteres por pantalla 
* ¿Qué problemas te encuentras? 
* ¿cómo lo has solucionado?
* 
* @author Rodolfo Aravena
* 
*/

public class ej08 {

	public static void main(String[] args) {
		char A = 'a';
		char E = 'e';
		char I = 'i';
		char O = 'o';
		char U = 'u';
		
		String cadena = String.valueOf(A) + " , " +
						String.valueOf(E) + " , " +
						String.valueOf(I) + " , " +
						String.valueOf(O) + " , " +
						String.valueOf(U);
		
		System.out.println("Las vocales son: " + cadena);
		
	}

}
