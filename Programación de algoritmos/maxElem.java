public class maxElem{
    //hacer un metodo recursivo que devuelva el numero maximo de un arreglo
    public static int maximo(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }
        return Math.max(arr[n-1], maximo(arr, n-1));
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int n = arr.length;
        int max = maximo(arr, n);
        System.out.println("El numero maximo del arreglo es: " + max);
    }
}