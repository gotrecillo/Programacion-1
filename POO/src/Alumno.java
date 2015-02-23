
public class Alumno implements Comparable {

	private String nombre;
	private String dni;
	private int notaBd;
	private int notaEntornos;
	private int notaPro;
	
	public Alumno(){
		
	}
	
	public Alumno(String nombre, String dni, int notaBd, int notaEntornos, int notaPro){
		this.nombre=nombre;
		this.notaBd=notaBd;
		this.notaEntornos=notaEntornos;
		this.notaPro=notaPro;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDni() {
		return dni;
	}
	public void setNotaBd(int notaBd) {
		this.notaBd = notaBd;
	}
	public int getNotaBd() {
		return notaBd;
	}
	public void setNotaEntornos(int notaEntornos) {
		this.notaEntornos = notaEntornos;
	}
	public int getNotaEntornos() {
		return notaEntornos;
	}
	public void setNotaPro(int notaPro) {
		this.notaPro = notaPro;
	}
	public int getNotaPro() {
		return notaPro;
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
    
    public int compareTo(Object o){
    	Alumno a=(Alumno)o;
    	return this.nombre.compareTo(a.nombre);
    }
    
    public double media(){
    	int suma= this.notaBd+this.notaEntornos+this.notaPro;
    	double media=suma/3;
    	return media;
    }
    
    

}
