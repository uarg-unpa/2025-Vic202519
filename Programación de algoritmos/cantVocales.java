import java.util.Scanner;
public class cantVocales{

    public static int vocales(String cd, int i) {

       
        if (i == cd.length())
            return 0;

       
        int resto = vocales(cd, i + 1);

        char c = cd.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

            return 1 + resto;
        }

        return resto;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase:");
        String texto = scanner.nextLine();

        while (texto.equals("")) {
            System.out.println("El texto no puede estar vacío, ingrese nuevamente:");
            texto = scanner.nextLine();
        }

        int total = vocales(texto, 0);

        System.out.println("Cantidad de vocales: " + total);

        scanner.close();
    }
}
