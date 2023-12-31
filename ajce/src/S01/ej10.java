package S01;
/**
 * Escribe un programa que pinte por pantalla alguna escena - el campo,
 * la habitación de una casa, un aula, etc. - o algún objeto animado o
 * inanimado - un coche, un gato, una taza de café, etc. Ten en cuenta
 * que puedes utilizar caracteres como *, +, <, #, @, etc. o incluso
 * caracteres Unicode. ¡Échale imaginación
 * en colores
 * 
 * @author Rodolfo Aravena
 * 
 */
public class ej10 {

	public static void main(String[] args) {
		String rojo = "\u001B[31m";
        String verd = "\u001B[32m";
        String amar = "\u001B[33m";
        String reset = "\u001B[0m";		
		System.out.println("\n\n");
		System.out.println(amar + "           4" + reset);
		System.out.println(verd + "          /\\" + reset);
		System.out.println(verd + "         //\\\\");
		System.out.println(verd + "        //" + rojo + "__" + verd + "\\\\" + reset);
		System.out.println(verd + "       //" + rojo + "____" + verd + "\\\\" + reset);
		System.out.println(verd + "      //" + rojo + "______" + verd + "\\\\" + reset);
		System.out.println(rojo + "          ||");
	}

}

