
public class Punto {
protected int x;
protected int y;

public Punto(){
	this.x=0;
	this.y=0;
}

public Punto(int x,int y){
	this.x=x;
	this.y=y;
}

public void setx(int x){
	this.x=x;
}
public int getx() {
	return x;
}
public void sety(int y){
	this.y=y;
}
public int gety(){
	return y;
}

public void distanciaAlOrigen(){
	
	double d=Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));

	System.out.printf("Distancia al origen: %d",d);
}

public void distanciaOtroPunto(Punto p1){
	double distancia=Math.sqrt(Math.pow((p1.x-this.x),2)+Math.pow((p1.y-this.y),2));
	System.out.printf("Distancia de x(%d) y(%d) a  x(%d) y(%d): %d",p1.x,this.x,p1.y,this.y,distancia);
}

public String toString(){
	String s="x= ";
	s=s+this.x+" y= "+ this.y;
	return s;
}

public boolean equals(Punto p1){
	if(this.x==p1.x && this.y==p1.y){
		return true;
	}else{
		return false;
	}
}


}
