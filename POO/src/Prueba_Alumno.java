
public class Prueba_Alumno {

	public static void main(String[] args) {
		Alumno a1=new Alumno ("Pepe","333K",5,6,7);
		Alumno a2=new Alumno ("Ivan","111S",4,8,3);
		
		//COMPARAR POR NOMBRE
		if(a1.compareTo(a2)<0){
			System.out.println("Alumnos por orden alfabético");
			System.out.println(a2);
			System.out.println(a1);
		}else if (a1.compareTo(a2)>0) {
			System.out.println("Alumnos por orden alfabético decreciente");
            System.out.println(a2);
            System.out.println(a1);
		}else{
			System.out.println("Mismo orden para todos los alumnos");
			System.out.println(a2);
			System.out.println(a1);
		}

		
		//COMPARAR POR DNI
		CompararPorDni c= new CompararPorDni();
		int respuesta= c.compare(a1, a2);
		System.out.println(respuesta);
		
		
	}

}
