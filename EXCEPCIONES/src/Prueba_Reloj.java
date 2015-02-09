
public class Prueba_Reloj {

	public static void main(String[] args) throws excepcionHoraIncorrecta {
		Reloj r1=new Reloj(11,35,41);
		Reloj horaActual=new Reloj();
		System.out.println(r1.toString());
		r1.validarHora(horaActual);

	}

}
