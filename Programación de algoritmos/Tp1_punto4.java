import java.util.Scanner;

public class Tp1_punto4{
    public static void main (String[]args){
        Scanner leer= new Scanner(System.in);

        System.out.print("Ingrese 3 numeros enteros: ");
        int NRO1=leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese 2 numeros enteros: ");
        int NRO2=leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese 1 numeros enteros: ");
        int NRO3=leer.nextInt();
        leer.nextLine();

        if(NRO1>NRO2 & NRO1>NRO3){
            System.out.print("El numero más grande es: "+NRO1);
        }
        else{
            if(NRO2>NRO1 & NRO2>NRO3){
                System.out.print("El numero más grande es: "+NRO2);
            }
            else{
                System.out.print("El numero más grande es: "+NRO3);
            }
        }
        leer.close();
    }
}