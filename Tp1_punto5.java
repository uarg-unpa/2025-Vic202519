import java.util.Scanner;

public class Tp1_punto5{
    public static void main (String[]args){
        Scanner leer1= new Scanner(System.in);
        char DIA;
        System.out.print("Ingrese una letra inicial de la semana: ");
        
        DIA=leer1.next().charAt(0);

        switch (DIA){
            case 'L':{
                System.out.print("Hoy tengo resolución");
                break;
            }
            case 'M':{
                System.out.print("Hoy no tengo resolución");
                break;
            }
            case 'I':{
                System.out.print("Hoy tengo resolución");
                break;
            }
            case 'J':{
                System.out.print("Hoy no tengo resolución");
                break;
            }
            case 'V':{
                System.out.print("Hoy tengo resolución");
                break;
            }
            case 'S':{
                System.out.print("Hoy no tengo resolución");
                break;
            }
            case 'D':{
                System.out.print("Hoy no tengo resolución");
                break;
            }
        }
        leer1.close();
    }
}