import java.util.Scanner;
public class parcialTema2_punto2{
    private final int maxpila=5;
    private int cima;
    private String [] elementos;

    //Constructor

    parcialTema2_punto2(){
        cima=-1;
        elementos=new String[maxpila];
        elemento=new String[maxcola];
        ultimo=-1;
    }

    //Metodos Pila

    public boolean estaVacia1(){
        return (cima==-1);
    }
    public void meter(String elem){
        cima++;
        elementos[cima]=elem;
    }
    public String sacar(){
        String aux=elementos[cima];
        cima--;
        return aux;
    }
    public boolean estaLlena1(){
        return (cima==maxpila-1);
    }

    //Metodos Cola

    private final int maxcola=5;
    private int ultimo;
    private String []elemento;

    public boolean estaLlena(){
        return(ultimo==maxcola-1);
    }
    public boolean estaVacia(){
        return(ultimo==-1);
    }
    public void insertar(String elem){
        if(!this.estaLlena()){
            ultimo++;
            elemento[ultimo]=elem;
        }
    }
    public String borrar(){
        String aux=elemento[0];
        for(int i=0;i<ultimo;i++){
            elemento[i]=elemento[i+1];
        }
        ultimo--;
        return aux;
    }
    //Main
    public static void main (String[]args){
        Scanner leer=new Scanner(System.in);
        parcialTema2_punto2 P1=new parcialTema2_punto2();
        parcialTema2_punto2 P2=new parcialTema2_punto2();
        parcialTema2_punto2 PA1=new parcialTema2_punto2();
        parcialTema2_punto2 PA2=new parcialTema2_punto2();
        parcialTema2_punto2 Q1=new parcialTema2_punto2();
        String aux1, aux2;

        for(int i=0;i<5;i++){
            System.out.println("Ingrese un elemento para P1:");
            aux1=leer.nextLine();
            P1.meter(aux1);
            PA1.meter(aux1);
            System.out.println("Ingrese un elemento para P2:");
            aux2=leer.nextLine();
            P2.meter(aux2);
            PA2.meter(aux2);
        }

        while(!P1.estaVacia1() || !P2.estaVacia1()){
            Q1.insertar(P1.sacar());
            Q1.insertar(P2.sacar());
            P1.meter(PA1.sacar());
            P2.meter(PA2.sacar());
        }
        leer.close();

    }
}