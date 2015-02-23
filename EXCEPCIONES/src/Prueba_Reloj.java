public class Prueba_Reloj {

	public static void main(String[] args) throws excepcionHoraIncorrecta {
		Reloj r1=new Reloj(11,35,41);
		Reloj r2=new Reloj(11,22,48);
		Reloj horaActual=new Reloj(11,35,41);
		System.out.println(r1.toString());
		r1.validarHora(horaActual);
		r2.validarHora(horaActual);
	}
}