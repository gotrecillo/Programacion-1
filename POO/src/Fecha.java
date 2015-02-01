import java.util.Scanner;

public class Fecha {
Scanner teclado = new Scanner (System.in);

private int dia;
private int mes;
private int anyo;

public void setDia (int dia){
	this.dia=dia;
}
public int getDia(){
	return dia;
}

public void setMes (int mes){
	this.mes=mes;
}
public int getMes(){
	return mes;
}

public void setAnyo (int anyo){
	this.anyo=anyo;
}
public int getAnyo(){
	return anyo;
}

public Fecha(){
	this.dia=0;
	this.mes=0;
	this.anyo=0;
}

public Fecha (int dia, int mes, int anyo){
	this.dia=dia;
	this.mes=mes;
	this.anyo=anyo;
}

public boolean equals (Fecha f1){
	if(this.dia==f1.dia && this.mes==f1.mes && this.anyo==f1.anyo){
		return true;
	}else{
		return false;
	}
}

public String toString(){
	String s="";
	s=s+dia+"/"+mes+"/"+anyo;
	return s;
}


}
