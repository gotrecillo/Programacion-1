/*array con números enteros, que diga si cada uno
 * es capicúa o no, ordenarlos, y borrar el menor
 * capicua*/
public class Ejercicio12 {
public static void main(String[] args) {

int a[]={1111,21,134,33,121,43};
int aux;
int i;
int n=a.length;
int menorCapicua = 0;
		
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
//borrar el menor capicua
	i=0;
	boolean buscoCapicua=true;
	while(i<n && buscoCapicua){
		capi=capicua(a[i]);
		if(capi){
	    menorCapicua=a[i];	
		buscoCapicua=false;
		}
	i++;
	}
	borrar(a, n, menorCapicua);
//visualizar sin el menor capicua
	System.out.println("\nSe borrará el menor capicua");
	for(i=0; i<n-1; i++){
		System.out.println(a[i]);
		}
}
/*****************************************/	
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
	
//buscar
public static int buscar(int a[], int n, int dato){
	int i=0;
	int pos=-1;
	while(i<n && pos==-1){
		if(a[i]==dato){
			pos=i;
		}
		i++;
	}
	return pos;
}

//borrar
public static void borrar(int a[], int n, int dato){
		int pos=buscar(a, n,dato);
		int i=pos;
		while(i<=n-2){
			a[i]=a[i+1];
			i++;
		}
		a[n-1]=0;
		n--;
	}
}
