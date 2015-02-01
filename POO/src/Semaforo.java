
public class Semaforo {
private ColorSemaforo color;

public Semaforo(){
	this.color=ColorSemaforo.ambar;
}

public Semaforo(ColorSemaforo color){
	this.color=color;
}

public String toString(){
	String s="";
	s=s+this.color;
	return s;
}

public void verSemaforo(){
	System.out.println(this);
}

public boolean equals(Semaforo s1){
	if(this.toString()==s1.toString()){
		return true;
	}else{
		return false;
	}
}

}
