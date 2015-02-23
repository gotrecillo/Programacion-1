//todo lo de esta clase tiene que ir tal cual
//el toString tiene que estar si o si
public class Nodo {
private int info;
private Nodo sig;

public Nodo(){
	this.info=0;
	this.sig=null;		
}

public Nodo(int info){
	this.info=info;
	this.sig=null;
}

public void setInfo(int info) {
	this.info = info;
}
public int getInfo() {
	return info;
}
public void setSig(Nodo sig) {
	this.sig = sig;
}
public Nodo getSig() {
	return sig;
}

public String toString(){
String s="";
s= s + this.info +"-->";
return s;
}


}
