
public class Asignatura {
private Ciclo ciclo;
private NombreAsignatura asignatura;
private static String codigo;
private Curso curso;

public Asignatura(){
	this.ciclo=null;
	this.asignatura=null;
	this.curso=null;
}

public Asignatura(Ciclo ciclo, NombreAsignatura asignatura, Curso curso){
	this.ciclo=ciclo;
	this.asignatura=asignatura;
	this.curso=curso;
}

public void setCiclo(Ciclo ciclo) {
	this.ciclo = ciclo;
}
public Ciclo getCiclo() {
	return ciclo;
}
public void setAsignatura(NombreAsignatura asignatura) {
	this.asignatura = asignatura;
}
public NombreAsignatura getAsignatura() {
	return asignatura;
}
public void setCurso(Curso curso) {
	this.curso = curso;
}
public Curso getCurso() {
	return curso;
}

public void imprimirAsignatura(){
	System.out.println(this);
}

public String toString(){
	String s=codigo;
	s=s+"\nCiclo "+ciclo+"\nAsignatura: "+asignatura+"\nCurso: "+curso;
	return s;
}

public boolean equals(Asignatura a1){
	if(this.asignatura==a1.asignatura && this.ciclo==a1.ciclo && this.curso==a1.curso){
		return true;
	}else{
		return false;
	}
}

}
