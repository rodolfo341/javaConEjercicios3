package S09;

public class PilotoFormula1 {
	private String nombre;
	private int edad;
	private String equipo;
	
	public PilotoFormula1() { super(); }
	
	public PilotoFormula1(String nombre, int edad, String equipo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.equipo = equipo;
	}
	
	public String getNombre() {	return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public int getEdad() { return edad;	}

	public void setEdad(int edad) {	this.edad = edad; }
	public String getEquipo() {	return equipo; }
	public void setEquipo(String equipo) { this.equipo = equipo; }
	
	
}
