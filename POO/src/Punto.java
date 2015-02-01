
public class Punto {
private int x;
private int y;

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
	int dx=this.x;
	int dy=this.y;
	System.out.printf("Distancia de x al origen: %d \nDistancia de y al origen: %d",x,y);
}

public void distanciaOtroPunto(Punto p1){
	int distanciaX=this.x-p1.x;
	int distanciaY=this.y-p1.y;
	System.out.printf("Distancia de x(%d) a y(%d): %d \nDistancia de x(%d) a y(%d): %d",p1.x,this.x,distanciaX,p1.y,this.y,distanciaY);
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
