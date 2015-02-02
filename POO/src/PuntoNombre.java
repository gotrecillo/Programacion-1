
public class PuntoNombre extends Punto{
private String nombre;

public PuntoNombre(String nombre, int x,int y){
	this.x=x;
	this.y=y;
	this.nombre=nombre;
}
public String toString(){
	String s="";
	s=s+this.nombre+" "+" x="+this.x+" y="+this.y;
	return s;
}






}
