import java.util.Random;


public class ParImpar {

	public static void main(String[] args) throws Exception {

		Random rm=new Random();
		int x=rm.nextInt(10);
		System.out.println(x);
		
		if(x%2==0){
			Exception par=new Exception("Numero par");
			throw par;
		}else{
			Exception impar=new Exception("numero impar");
			throw impar;
		}
		
	}

}