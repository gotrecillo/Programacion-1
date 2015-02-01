
public class Prueba_Punto {

	public static void main(String[] args) {
		Punto p1=new Punto(5,11);
		Punto p2=new Punto(3,7);
		
		System.out.println(p1.toString());
		p1.distanciaAlOrigen();
		System.out.println();
		p2.distanciaOtroPunto(p1);
		System.out.println();
		boolean equals=p2.equals(p1);
		
		if(equals){
			System.out.println("x e y de ambos puntos son iguales");
		}else{
			System.out.println("x e y de ambos puntos son distintos");
		}

	}

}
