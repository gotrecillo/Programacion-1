
public class Alumno {

	private String nombre;
	private int matricula;
	private char grupo;
	private int grado;
	
	
	public Alumno(){
		nombre="";
		matricula=0;
		grupo=' ';
		grado=0;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}
	public char getGrupo() {
		return grupo;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	public int getGrado() {
		return grado;
	}
	
	
	
	
}
