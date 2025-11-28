public class cadenaInversa{
    //hacer un metodo recursivo que muestre una cadena de string al reves
    public static String stringInverso(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + stringInverso(str.substring(0, str.length() - 1));
    }
    //verificacion de su uso
    public static void main(String[] args) {
        String str = "Hola Mundo";
        String reversed = stringInverso(str);
        System.out.println("La cadena invertida es: " + reversed);
    }
}