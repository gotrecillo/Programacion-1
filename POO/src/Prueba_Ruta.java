
public class Prueba_Ruta {

	public static void main(String[] args) {
		Ruta r1=new Ruta();
		Ruta r2=new Ruta();
		
		r1.llenar();
		System.out.println(r1.toString());
		
		boolean equal=r1.equals(r2);
		
		if (equal){
			System.out.println("Rutas iguales");
		}else{
			System.out.println("Rutas distintas");
		}
		

	}

}
