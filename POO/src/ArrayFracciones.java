import java.util.Scanner;

public class ArrayFracciones{
	static Scanner teclado=new Scanner(System.in);
	
    public static void main(String[] args) {
    	Fraccion a[]=new Fraccion [5];
    	int n = 0;
    	int d = 0;
    	
    	for(int i=0; i<a.length; i++){
    		System.out.println("introduce numerador: ");
    		n=teclado.nextInt();
    		System.out.println("Introduce denominador:");
    	    d=teclado.nextInt();
    	    System.out.println();
    	    a[i]=new Fraccion(n,d);
    	}
    	

    	
    	for(int i=0; i<a.length; i++){
    		System.out.println(i+"["+a[i].getN()+"/"+a[i].getD()+"]");
    	}
    	
	}





}
