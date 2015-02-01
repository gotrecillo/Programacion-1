public class Fraccion {
private int n;
private int d;

public Fraccion(){
	this.n=0;
	this.d=0;
}

public Fraccion(int n, int d){
	this.n=n;
	this.d=d;
}

public void setN(int n) {
	this.n = n;
}
public void setD(int d){
	this.d=d;
}
public int getN() {
	return n;
}
public int getD() {
	return d;
}


public String toString(){
	String s="";
	s=s+this.n+"/"+d;
	return s;
}


}
