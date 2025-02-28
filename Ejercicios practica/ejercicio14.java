import java.util.Scanner;
import java.util.Arrays;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese el elemento %d: ", i + 1);
            A[i] = scanner.nextInt();
        }
        int[] B = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            B[i] = A[i] - A[i + 1];
        }
        System.out.println("Arreglo A: " + Arrays.toString(A));
        System.out.println("Arreglo resultante B (diferencias): " + Arrays.toString(B));
        scanner.close();
    }
}

