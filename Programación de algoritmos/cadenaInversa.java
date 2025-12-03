public class cadenaInversa{
    //hacer un metodo recursivo que muestre una cadena de string al reves, letra por letra una debajo de la otra, y en caso de que este vacio imprime "" o sino nada
    public static void stringInverso(String p){
        if(p.length() <= 0)
            return;

        else {
            stringInverso(p.substring(1));
            System.out.println(p.charAt(0));
        }

    }
    //main
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        stringInverso(cadena);
    }
}