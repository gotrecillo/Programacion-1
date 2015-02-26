/*buscar un array dentro de otro 
 */
public class Ejercicio14 {
public static void main(String[] args) {
int a[]={6,3,2,1,7,11,4,3,8,3,2,1,9};
//int a[]={6,3,2,1,7,11,4,8,3,2,1,9};
//si quitase ese 3 ya sí que me sale que 2 veces repetida, por lo que creo que son dos cosas las que he hecho mal
int b[]={3,2,1};
int i; //desplazamiento array a 
int j; //desplazamiento de array b
int c=0; //coincidencias

boolean coincidencia;
i = 0;
while (i < a.lenght - b.length){
  j = 0;
  coincidencia = false;
  if (a[i] == b[0]){
    coincidencia = true;
    while (j < b.length $$ coincidencia){
      if (a[i+j] != b[j]){
        coincidencia = false;
      }
    }
  }
  if (coincidencia){
    c++;	
  }
}

system.out.println(c);

}
}
