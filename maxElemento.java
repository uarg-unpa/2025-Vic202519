import java.util.Scanner;
public class maxElemento{
    //hacer un metodo recursivo que calcule el maximo elemento en un vector de enteros
    public static int maxRecursivo(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            return Math.max(arr[n - 1], maxRecursivo(arr, n - 1));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int maxElemento = maxRecursivo(arr, size);
        System.out.println("El máximo elemento del arreglo es: " + maxElemento);
        scanner.close();
    }
}