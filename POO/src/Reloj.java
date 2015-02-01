import java.util.Scanner;


public class Reloj {
static Scanner teclado=new Scanner(System.in);
private int hora;
private int minuto;
private int segundo;

public void setHora(int hora){
	this.hora=hora;
}
public int getHora() {
	return hora;
}
public void setMinuto(int minuto) {
	this.minuto = minuto;
}
public int getMinuto() {
	return minuto;
}
public void setSegundo(int segundo) {
	this.segundo = segundo;
}
public int getSegundo() {
	return segundo;
}

public String toString(){
	String s="La hora introducida es: ";
	String apm;
	if(hora>=12){
		apm="pm";
	}else{
		apm="am";
	}
	s=s+hora+":"+minuto+":"+segundo+apm;
	return s;		
}

public boolean equals(Reloj h1){
	if(this.hora==h1.hora && this.minuto==h1.minuto && this.segundo==h1.segundo){
		return true;
	}else{
		return false;
	}
}

public boolean validarHora(Reloj horaActual){
	if(this.hora==horaActual.hora && this.minuto==horaActual.minuto && this.segundo==horaActual.segundo){
		return true;
	}else{
		return false;
	}
}

public void ponHora(Reloj h1){
	System.out.println("Introduce una hora");
	System.out.println("\nhora:");
	h1.hora=teclado.nextInt();
	System.out.println("minuto");
	h1.minuto=teclado.nextInt();
	System.out.println("segundo");
	h1.segundo=teclado.nextInt();
}

}
