
public class Prueba_reloj {

	public static void main(String[] args) {
		Reloj h1=new Reloj();
		Reloj horaActual=new Reloj();
		
		horaActual.setHora(11);
		horaActual.setMinuto(54);
		horaActual.setSegundo(23);
		
		h1.ponHora(h1);
		boolean validar=h1.validarHora(horaActual);
		if(validar){
			System.out.println("La hora es correcta");
		}else{
			System.out.println("La hora es incorrecta");
		}
		
		System.out.println(h1.toString());
		
		boolean equals=h1.equals(horaActual);

		if(equals){
			System.out.println("Horas iguales");
		}else{
			System.out.println("Horas distintas");
		}
	}

}
