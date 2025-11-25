import java.util.Scanner;
public class Tp6_punto5{
    //Escribir un metodo recursivo que calcule la siguiente suma:
    //2+4+6+...+(n-1)+n

    public static int sumaRecursiva(int n) {
        if (n == 2) {
            return 2;
        } 
        else {
            return n + sumaRecursiva(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = scanner.nextInt();
        if(n % 2 == 0){
            int resultado = sumaRecursiva(n);
            System.out.println("La suma de 2 a " + n + " es: " + resultado);
        } else {
            n=n-1;
            int resultado = sumaRecursiva(n);
            System.out.println("El numero ingresado no es par. La suma de 2 a " + n + " es: " + resultado);
        }
        scanner.close();
    }
}