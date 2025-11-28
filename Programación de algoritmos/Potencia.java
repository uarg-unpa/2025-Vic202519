import java.util.Scanner;
public class Potencia{
    public static int potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1; //devuelve el resultado completo de la potencia
        } else {
            return base * potenciaRecursiva(base, exponente - 1); //aca lo que ocurre es que se va multiplicando la base por si misma exponente veces
            //2^3 = 2 * 2^2 = 2 * (2 * 2^1) = 2 * (2 * (2 * 2^0)) = 2 * (2 * (2 * 1)) = 8
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base (entero): ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el exponente (entero no negativo): ");
        int exponente = scanner.nextInt();
        if (exponente < 0) {
            System.out.println("El exponente debe ser un entero no negativo.");
        } else {
            int resultado = potenciaRecursiva(base, exponente);
            System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
        }
        scanner.close();
    }
}