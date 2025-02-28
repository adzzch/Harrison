import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas:");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = sc.nextInt();

        int[][] matriz = new int [filas][columnas];
        for (int i = 0 ; i < filas; i++) {
            for (int j = 0; j< columnas; j++){
                System.out.println("Ingrese el elemento para la fila" + (i +1) + ":");
                matriz[i][j] = sc.nextInt();
            }
      
        }


    int[] sumarFilas = new int[filas];
    for (int i = 0 ; i < filas; i++){
        int suma = 0;
        for (int j = 0; j < columnas; j++){
            suma += matriz[i][j];
        }
        sumarFilas[i] = suma;
    }


    int[] sumarColumnas = new int[columnas];
    for (int i = 0 ; i < filas; i++){
        int suma = 0;
        for (int j = 0; j < columnas; j++){
            suma += matriz[i][j];
        }
        sumarColumnas[i] = suma;
    }

    System.out.println("Matriz:");
    for (int i = 0; i< filas; i++){
        System.out.println(Arrays.toString(matriz[i]));
    }

    System.out.println("Suma de cada fila" + Arrays.toString(sumarFilas));
    System.out.println("Suma de cada fila" + Arrays.toString(sumarColumnas));



















    }
}