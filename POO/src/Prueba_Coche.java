
public class Prueba_Coche {

	public static void main(String[] args) {
		
		Coche c1=new Coche();
		Coche c2=new Coche();
		
		c1.imprimeCoche();
		System.out.println(c1.toString());
		
		boolean iguales=c2.equals(c1);

		if(iguales){
			System.out.println("Los coches son iguales");
		}else{
			System.out.println("Coches diferentes");
		}
	}

}
