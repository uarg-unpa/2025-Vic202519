import java.util.Scanner;

public class Tp1_punto6_B{
    public static void main (String[]args){
        Scanner leer3= new Scanner(System.in);
        int PRODUCTO=1;
        int SUMA=0;
        int CONT=1;
        while(CONT<=3){
            System.out.print("Ingrese un numero: ");
            int NUM=leer3.nextInt();
            SUMA=SUMA + NUM;
            PRODUCTO= PRODUCTO*NUM;
            CONT= CONT+1;
        }
        System.out.println("Suma de enteros: "+SUMA);
        System.out.println("Producto de enteros: "+PRODUCTO);
        leer3.close();
    }
}