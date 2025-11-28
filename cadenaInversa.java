public class cadenaInversa{
    //hacer un metodo recursivo que muestre una cadena de string al reves, letra por letra una debajo de la otra.
    public static String stringInverso(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + "\n" + stringInverso(str.substring(0, str.length() - 1));
    }
    //main
    public static void main(String[] args) {
        String original = "Hola Mundo";
        String inversa = stringInverso(original);
        System.out.println("Cadena inversa: " + inversa);
    }
}