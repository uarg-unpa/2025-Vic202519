import java.util.Scanner;
public class Tp6_punto4{
    //Escribir un metodo recursivo que calcule la siguiente suma:
    //1+2+3+...+n(n-1)+n

    public static int sumaRecursiva(int n) {
        if (n == 1) { //---> Caso base
            return 1;
        } else {
            return n + sumaRecursiva(n - 1);//---> Caso general
                                    //|----> llamador más pequeño
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = scanner.nextInt();
        int resultado = sumaRecursiva(n);
        System.out.println("La suma de 1 a " + n + " es: " + resultado);
        scanner.close();
    }
}