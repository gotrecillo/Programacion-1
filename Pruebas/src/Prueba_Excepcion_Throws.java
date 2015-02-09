import java.util.Scanner;
import java.util.Scanner;

public class Prueba_Excepcion_Throws {
static	Scanner teclado=new Scanner(System.in);
	
public static void main(String[] args) {

		try{
			ExcepcionX();
		}catch(Exception e){
			System.out.println("Ese no es un número");
		}
	}


	public static void ExcepcionX() throws Exception{
		System.out.println("Introduce un número");
		int x=teclado.nextInt();
		System.out.println(x);
		
	}

	}

