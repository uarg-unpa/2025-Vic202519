import java.util.Scanner;

public class Tp1_punto6_A{
    public static void main (String[]args){
        Scanner leer2= new Scanner(System.in);
        System.out.print("Ingrese 3 numeros enteros: ");
        int nro1= leer2.nextInt();
        int nro2= leer2.nextInt();
        int nro3= leer2.nextInt();

        int PRODUCTO= nro1*nro2*nro3;
        int SUMA= nro1+nro2+nro3;

        System.out.println("El resultado de sumar los 3 numeros es de: "+SUMA);
        System.out.println("El resultado de multiplicar los 3 numeros es de: "+PRODUCTO  );
        leer2.close();
    }
}