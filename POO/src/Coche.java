
public class Coche {
private String modelo;
private boolean metalizado;
private String matricula;
private int año;
private TipoSeguro seguro;
private TipoCoche tipoCoche;
private Color color;

public Coche(){
	this.modelo="BMW";
	this.metalizado=false;
	this.matricula="11A11";
	this.año=1993;
	this.seguro=TipoSeguro.a_terceros;
	this.tipoCoche=TipoCoche.deportivo;
	this.color=Color.gris;
}

public Coche(String modelo, boolean metalizado, String matricula, int año, TipoSeguro seguro, TipoCoche tipoCoche, Color color){
	this.modelo=modelo;
	this.metalizado=metalizado;
	this.matricula=matricula;  
	this.año=año;
	this.seguro=seguro;
	this.tipoCoche=tipoCoche;
	this.color=color;
}

public void setModelo(){
	this.modelo=modelo;
}
public String getModelo(){
	return modelo;
}
public String getMatricula(){
	return matricula;
}
public void setMatricula(){
	this.matricula=matricula;
}
public void setAño(int año) {
	this.año = año;
}
public int getAño() {
	return año;
}
public void setColor(Color color) {
	this.color = color;
}
public Color getColor() {
	return color;
}
public void setMetalizado(boolean metalizado) {
	this.metalizado = metalizado;
}
public void setTipoCoche(TipoCoche tipoCoche) {
	this.tipoCoche = tipoCoche;
}
public TipoCoche getTipoCoche() {
	return tipoCoche;
}
public void setSeguro(TipoSeguro seguro) {
	this.seguro = seguro;
}
public TipoSeguro getSeguro() {
	return seguro;
}


public String toString(){
	String s="";
	String metal;
	if(metalizado==true){
		metal= "metalizado";
	}else{
		metal="";
	}
	s=s+this.modelo+"-"+color+"-"+metal+"-"+matricula+"-"+tipoCoche+"-"+año+"-"+seguro;
    return s;
}


public void imprimeCoche(){
	System.out.println(this);
}

public boolean equals(Coche c1){
	if(c1.modelo==this.modelo&&c1.color==this.color&&c1.metalizado==this.metalizado
			&&c1.matricula==this.matricula&&c1.tipoCoche==this.tipoCoche&&c1.año==this.año
			&&c1.seguro==this.seguro){
		return true;
	}else{
		return false;
	}
}

}
