import java.util.Scanner;
public class Pila_punto3{
    final int maxpila=10;
    String [] elementos;
    int cima;

    public Pila_punto3(){
        elementos= new String [maxpila];
        cima=-1;
    }
    public boolean estaVacia(){
        return (cima==-1);
    }
    public boolean estaLlena(){
        return (cima==maxpila-1);
    }
    public void meter(String e){
        cima=cima+1;
        elementos[cima]=e;
    }
    public String sacar(){
        String aux=elementos[cima];
        cima=cima-1;
        return aux;
    }
    public static void main (String[]args){
        Pila_punto3 P1= new Pila_punto3();
        Scanner leer= new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una cadena de caracteres: ");
        for(int i=1;i<=10;i++){
            letra= leer.nextLine();
            P1.meter(letra);
        }
        for(int i=1;i<=10;i++){
            System.out.println("---------------------------");
            System.out.println(P1.sacar());
        }
        System.out.println("---------------------------");
        leer.close();
    }
}