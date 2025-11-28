public class productPares{
    //hacer un metodo recursivo que calcule el producto de los numeros pares de un arreglo
    public static int productoPares(int[] arr, int index) {
        if (index == arr.length) {
            return 1;
        }
        int current = arr[index];
        int producto = productoPares(arr, index + 1);
        
        if (current % 2 == 0) {
            return current * producto;
        } 
        else {
            return producto;
        }
    }
    //verificacion de su uso
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 1, 1, 1};            
        int result = productoPares(arr, 0);
        System.out.println("El producto de los numeros pares es: " + result);
    }
}
