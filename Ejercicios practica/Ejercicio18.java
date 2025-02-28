public class Ejercicio18 {
    public static void main(String[] args) {
        
        int[][] tabla = new int[10][10];
        
        
        for (int i = 0; i < 10; i++) {         // i representa los números del 1 al 10 (fila)
            for (int j = 0; j < 10; j++) {     // j representa los números del 1 al 10 (columna)
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }
        
     
        System.out.println("Tabla de multiplicar del 1 al 10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabla[i][j] + "\t"); 
            }
            System.out.println(); 
        }
    }
}

