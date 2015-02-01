
public class Prueba_Semaforo {

	public static void main(String[] args) {
		Semaforo s1=new Semaforo(ColorSemaforo.verde);
		Semaforo s2=new Semaforo(); //constructor por defecto en ambar
		Semaforo s3=new Semaforo(ColorSemaforo.rojo); //este y el s1 constructor con parametros
		
	   //void ver semaforo
       s1.verSemaforo();
      
       //toString
      System.out.println( s2.toString());

      //equals
      
      if(s2.equals(s1)==true){
    	  System.out.println("Los semáforos están en el mismo color");
      }else{
    	  System.out.println("Los semáforos están en diferente color");
      }
      
	}

}
