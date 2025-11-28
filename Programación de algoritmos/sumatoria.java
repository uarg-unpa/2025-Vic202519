    import java.util.Scanner;
    public class sumatoria{
        //hacer la sumatoria de todos los numeros de posicion par en un vector, mediante un metodo recursivo
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el tamaño del vector: ");
            int n = scanner.nextInt();
            int[] vector = new int[n];
            System.out.println("Ingrese los elementos del vector:");
            for (int i = 0; i < n; i++) {
                vector[i] = scanner.nextInt();
            }
            int suma = sumaPosicionesPares(vector, 0);
            System.out.println("La sumatoria de los elementos en posiciones pares es: " + suma);
            scanner.close();
        }
        
        public static int sumaPosicionesPares(int[] vector, int index) {
            if (index >= vector.length) {
                return 0;
            }
            return vector[index] + sumaPosicionesPares(vector, index + 2);
        }
    }