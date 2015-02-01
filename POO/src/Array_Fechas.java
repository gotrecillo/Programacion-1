import java.util.Scanner;


public class Array_Fechas {
static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		Fecha f[]=new Fecha[5];
		int dia=0;
		int mes=0;
		int anyo=0;		
		
		System.out.println("Array de fechas");
		System.out.println();
		
		for(int i=0; i<f.length; i++){
		 System.out.println("Día:");	
		 dia=teclado.nextInt();
		 System.out.println("Mes:");
		 mes=teclado.nextInt();
		 System.out.println("Año:");
		 anyo=teclado.nextInt();
		 f[i]=new Fecha(dia,mes,anyo);
		}
		
		for(int i=0; i<f.length;i++){
			System.out.println("["+f[i].toString()+"]");
		}

	}

}
