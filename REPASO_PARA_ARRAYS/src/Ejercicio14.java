/*buscar un array dentro de otro 
 * mostrar las posiciones*/
public class Ejercicio14 {
public static void main(String[] args) {
int a[]={6,3,2,1,7,11,4,3,8,3,2,1,9};
int b[]={3,2,1};
int i;
int j;
int n=b.length;
int c=0;
int coincidencias=0;


i=0;
while(i<a.length){
	j=0;
		if(a[i]==b[j]){
			while(j<n){
			c++;
			j++;
		}
	}
		i++;
}

System.out.println(c);

if(c>=n){
	coincidencias=c/n;
	System.out.println(coincidencias +" veces repetida");
}else{
	System.out.println("La secuencia no está ninguna vez");
}

	}

}
