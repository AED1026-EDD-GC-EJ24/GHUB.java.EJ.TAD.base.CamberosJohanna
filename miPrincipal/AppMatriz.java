import java.util.Scanner;

public class AppMatriz {
    
    public static void menu() throws PosicionIlegalException {
        System.out.println("==================================");
		System.out.println("    Operaciones con Matrices      ");
        System.out.println("==================================");
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();
        
        Matriz m = new Matriz(filas, columnas);
        
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "," + j + "]: ");
                int valor = scanner.nextInt();
                m.asignarMatriz(i, j, valor);
            }
        }
        
        System.out.println("Matriz ingresada:");
        int[][] matriz = m.getMatriz();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("Filas = " + m.filasMat());
        System.out.println("Columnas = " + m.columnasMat());
    }
}