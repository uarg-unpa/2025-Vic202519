import java.util.Scanner;
public class array{
    //Dado un array de elementos enteros, diseñar tres algoritmos recursivos que calculen: a) El mayor elemento del array. b) El producto de todos los elementos del array. c) La cantidad de numeros negativos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Mayor elemento: " + mayorElemento(array, n - 1));
        System.out.println("Producto de todos los elementos: " + productoElementos(array, n - 1));
        System.out.println("Cantidad de números negativos: " + cantidadNegativos(array, n - 1));
        
        scanner.close();
    }
    
    public static int mayorElemento(int[] array, int index) {
        if (index == 0) {
            return array[0];
        }
        return Math.max(array[index], mayorElemento(array, index - 1));
    }
    
    public static int productoElementos(int[] array, int index) {
        if (index == 0) {
            return array[0];
        }
        return array[index] * productoElementos(array, index - 1);
    }
    
    public static int cantidadNegativos(int[] array, int index) {
        if (index == 0) {
            return array[0] < 0 ? 1 : 0;
        }
        return (array[index] < 0 ? 1 : 0) + cantidadNegativos(array, index - 1);
    }
}