public class suma3{
    public static int sumaRecursiva(int n) {
        if (n == 3) {
            return 3;
        } else {
            return n + sumaRecursiva(n - 3);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = scanner.nextInt();
        if(n % 3 == 0){
            int resultado = sumaRecursiva(n);
            System.out.println("La suma de 3 a " + n + " es: " + resultado);
        } else {
            n=n-(n % 3);
            int resultado = sumaRecursiva(n);
            System.out.println("El numero ingresado no es multiplo de 3. La suma de 3 a " + n + " es: " + resultado);
        }
        scanner.close();
    }
}