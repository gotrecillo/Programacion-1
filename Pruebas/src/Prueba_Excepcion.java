import java.util.Scanner;


public class Prueba_Excepcion {
	static	Scanner teclado=new Scanner(System.in);
public static void main(String[] args) {

	int x;
	
	try{
		System.out.println("Introduce un número:");
		x=teclado.nextInt();
		System.out.println(x);
	}catch(Exception e){
		System.out.println("Ese no es un número");
	}
}


}
