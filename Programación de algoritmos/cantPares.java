public class cantPares{
    //hacer un metodo recursivo que cuente la cantidad de numeros pares de un numero n
    public static int contarPares(int n) {
        // Caso base: si n es 0, no hay numeros para contar
        if (n == 0) {
            return 0;
        } else {
            // Verificar si el ultimo digito es par
            int ultimoDigito = n % 10;
            int esPar = (ultimoDigito % 2 == 0) ? 1 : 0;
            // Llamada recursiva con el numero sin el ultimo digito
            return esPar + contarPares(n / 10);
        }
    }
    public static void main(String[] args) {
        int numero = 123456;
        int cantidadPares = contarPares(numero);
        System.out.println("Cantidad de numeros pares en " + numero + " es: " + cantidadPares);
    }

}