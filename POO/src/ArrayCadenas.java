	import java.util.Scanner;


	public class ArrayCadenas {
	static Scanner teclado=new Scanner(System.in);

	public static void ordenar(String nombres[]){
		int i=0;
		int n=nombres.length;
		
		while(i<=n-1){
			 for(int j=i+1;j<=n-1;j++){
				 if(nombres[i].compareTo(nombres[j])>0){
	                 String aux=nombres[i];
	                 nombres[i]=nombres[j];
	                 nombres[j]=aux;
				 }
	             }
		i++;		 
		}
	}
	
	public static void visualiza(String nombres[]){
		int n=nombres.length;
		int i=0;
		while(i<=n-1){
			System.out.println(nombres[i]);
			i++;
		}
	}

	public static void main(String[] args) {

		String nombres[]={"Ivan","Luis","Carmen","Lorena"};
		int n=nombres.length;
		
		visualiza(nombres);
		ordenar(nombres);
		System.out.println();
		visualiza(nombres);
		

	}
}
