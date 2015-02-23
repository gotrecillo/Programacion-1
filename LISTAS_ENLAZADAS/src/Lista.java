import java.util.Scanner;


public class Lista {
private Nodo inicio;
static Scanner teclado=new Scanner(System.in);

public Lista(){
	inicio=null;
}

/*RECORRER/VISUALIZAR LISTA
inicio info sig  info sig  info sig
[·] --> [7][·]-->[11][·]-->[3][ ]

p señala al mismo sitio que señala inicio, osea al 7 
[·]
p.getSig señala al siguiente, osea 3
*/
public void recorrido(){
	
Nodo p;
p=this.inicio;
while(p!=null){
	System.out.println(p);
	p=p.getSig();
}
}


//TO STRING

public String toString(){
	Nodo n=this.inicio;
	String s="";
	while(n!=null){
		s=s+n.toString();
		n=n.getSig();
	}
	return s;
	}

//AÑADIR POR PRINCIPIO
public void insertarPrincipio(int dato){
	Nodo n=new Nodo(dato);
	n.setSig(inicio);
	this.inicio=n;
}




}
