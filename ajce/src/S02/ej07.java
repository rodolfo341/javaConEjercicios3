package S02;
/**
* 
* Escribe un programa que declare variables de tipo char y de tipo String. 
* Intenta mostrarlas por pantalla todas juntas en la misma línea y 
* con una sola sentencia de Java (con un solo println) ¿es posible?
* 
* @author Rodolfo Aravena
* 
*/

public class ej07 {

	public static void main(String[] args) {
		char vocal1 = 'y';
		char vocal2 = 'o';
		String mama = " mi mama me mima ";
		String papa = " mi papa tambien ";
		
		System.out.println(mama + vocal1 + papa);
		System.out.println(mama + vocal2 + papa);
		
	}

}
