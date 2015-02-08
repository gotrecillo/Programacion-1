import java.util.Scanner;


public class Ruta {
static Scanner teclado=new Scanner(System.in);
private PuntoNombre ruta[];
private int n;

public Ruta(){
	this.ruta=new PuntoNombre[2];
	this.n=ruta.length;
}

public void llenar(){
for(int i=0;i<=n-1;i++){
	System.out.println("Nombre punto: ");
	String p=teclado.next();
	System.out.println("Valor de x: ");
	int x=teclado.nextInt();
	System.out.println("Valor de y: ");
	int y=teclado.nextInt();
	ruta[i]=new PuntoNombre(p,x,y);
}
}

public String toString(){
	String s="";
	for(int i=0; i<=n-1; i++){
		s=s+ "["+ ruta[i]+"]";
	}
	return s;	
}


public boolean equals(Object o){
	Ruta r = (Ruta) o;
	boolean equal = false;
	
		for(int i=0; i<n;i++){
			if(this.ruta[i].equals(r.ruta[i])==false){
			equal=false;		
	}else{
		equal=true;
	}
}
	if(equal){
		return true;
	}else{
		return false;
	}
	
}




}
