
public class Ejercicio12 {

	public static void main(String[] args) {

		int a[]={1111,21,134,33,121,43};
		int aux;
		int i;
		int n=a.length;
		int menor;
		//ordenarlo
		for(i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-1-i; j++){
				if(a[j+1]<a[j]){
					aux=a[j+1];
					a[j+1]=a[j];
					a[j]=aux;
				}
			}
			
		}
		
		//capicua o no
		i=0;
		boolean capi;
		while(i<a.length){
			capi=capicua(a[i]);
			if(capi){
				System.out.println(a[i]+" capicua");
			}else{
				System.out.println(a[i]+" no capicua");
			}
			i++;
		}
		
		//esto no esta bien buscarlo IMPORTANTE
		i=0;
		boolean cap;
		while(i<n){
			cap=capicua(a[i]);
			if(cap){
				borrar(a, n, a[i]);
			}
			i++;
		}
		
		
		for(i=0; i<n; i++){
			System.out.println(a[i]);
		}
		
	}
	
//capicua
public static boolean capicua(int num){
	int falta=num;
	int invertido=0;
	int resto=0;
	while(falta!=0){
		resto=falta%10;
		invertido=invertido*10+resto;
		falta=falta/10;
	}
	if(invertido==num){
		return true;
	}else{
		return false;
	}
}
	
//buscar menor
public static int buscarMenor(int a[], int n){
	int i=1;
	int posmenor=0;
	int menor=a[posmenor];
	while(i<n){
		if(a[i]<menor){
			posmenor=i;
		}
		i++;
	}
	return menor;
}


//borrar
public static void borrar(int a[], int n, int dato){
		int pos=buscarMenor(a, n);
		int i=pos;
		while(i<=n-2){
			a[i]=a[i+1];
			i++;
		}
		a[n-1]=0;
		n--;
	}

	
	

}
