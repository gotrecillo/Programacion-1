/*2. Diseñar la clase  Reloj que señale la hora, 
 * minuto y segundo con sus constructores, 
 * métodos get y set correspondientes, 
 * toString() que daraá la hora en horario 12H ó 24H, 
 * indicando en este caso si la hora (de 1 a 12 ) 
 * es am ó pm. Y un  método validarHora() que 
 * compruebe que una hora determinada es correcta y 
 * lance una excepción de la clase Exception si la
 * hora, minuto o segundo no son correctos. 
 * El constructor con argumentos y un metodo 
 * ponHora() deben validar la hora.
 * */
 

public class Reloj {
private int hora;
private int min;
private int seg;

public Reloj(){
	this.hora=0;
	this.min=0;
	this.seg=0;
}

public Reloj(int hora,int min,int seg){
	this.hora=hora;
	this.min=min;
	this.seg=seg;
}


public String toString(){
	String s="";
	String ampm="";
	
	if(this.hora>=12){
		ampm="pm";
	}else{
		ampm="am";
	}
	
	s=this.hora+":"+this.min+":"+this.seg+ampm;
	return s;	
}


public void ponHora(Reloj horaActual){
	horaActual.hora=hora;
	horaActual.min=min;
	horaActual.seg=seg;
}


public void validarHora(Reloj horaActual)throws excepcionHoraIncorrecta{
	if(this.hora!=horaActual.hora || this.min!=horaActual.min || this.seg!=horaActual.seg){
	throw new excepcionHoraIncorrecta("La hora no es correcta");
}
}
	

}