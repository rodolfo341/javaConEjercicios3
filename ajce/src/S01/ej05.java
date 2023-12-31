package S01;
/**
* 5. Modifica el programa anterior añadiendo colores. Puedes mostrar
* cada asignatura de un color diferente.
*
* @author Rodolfo Aravena
*/
public class ej05 {

	public static void main(String[] args) {
		String rojo = "\u001B[31m";
        String verde = "\u001B[32m";
        String amarillo = "\u001B[33m";
        String resetearColor = "\u001B[0m";
        
		System.out.println(rojo + "LUNES \t\t MARTES \t MIERCOLES" + resetearColor);
		System.out.println("-------------------------------------------");
		System.out.println(verde +"desayuno \t desayuno \t desayuno" + resetearColor);
		System.out.println(amarillo + "cena \t\t cena \t\t cena" + resetearColor);
	}

}
