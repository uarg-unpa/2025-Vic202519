public class productPares{
    //hacer un metodo recursivo que calcule el producto de los numeros pares de un arreglo
    public static int productoPares(int[] arreglo, int index) {
        if (index == arreglo.length) {
            return 1;
        }
        if (arreglo[index] % 2 == 0) {
            return arreglo[index] * productoPares(arreglo, index+1);
        } 
        else {
            return productoPares(arreglo, index+1);
        }
    }
    //main
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0};            
        int result = productoPares(arr, 0);
        System.out.println("El producto de los numeros pares es: " + result);
    }
}
