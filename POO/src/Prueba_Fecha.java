
public class Prueba_Fecha {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(11,11,2011);
		Fecha f2 = new Fecha(13,11,2014);

		boolean equals= f2.equals(f1);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		if (equals){
			System.out.println("Las fechas son iguales");
		}else{
			System.out.println("Las fechas son distintas");
		}
	}
}
