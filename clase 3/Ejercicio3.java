public class Ejercicio3{

   public static void main(String[]args) {


    /*
     * 3.Dado un arreglo lineal de numero, sumar separadamente 
     * los numeros pares y los impares.
     * 
     * Análisis: declarar un arreglo,en dos variables ir guardando 
     * la suma de los numeros pares y numeros impres, lo anterior debe 
     * iterar en un "For" con la condición de validar si el 
     * numero es par o impar (n%2 == 0 -> par)
     */

     int[] b = {5,2,6,5,9,90,1,8,15,4 };
     int sumaPares = 0, sumaImpares=0;

     for (int i =0; i < b.length; i++){
        if(b[i]%2 ==0 ){
            sumaPares = sumaPares + b[i];  
        }else{
            sumaImpares += b[i];
        }

     }

     System.out.println("La suma de los numeros pares es:" + sumaPares);
     System.err.println("La suma de los numeros impares es:" + sumaImpares);

   }

}
