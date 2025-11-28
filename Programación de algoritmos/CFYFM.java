public class CFYFM{
    //cola de frente y final movible (Cola circular FIFO)
    private final int maxcola=5;
    private int frente, ultimo;
    private int [] elementos;

    public CFYFM(){
        elementos=new int[maxcola];
        frente=0;
        ultimo=0;
    }
    public boolean esVacia(){
        return frente==ultimo;
    }
    public boolean esLlena(){
        int sigultimo=siguiente(ultimo);
        return (sigultimo==frente);
    }
    private int siguiente(int subind){
        if(subind+1==maxcola-1){
            return 0;
        }
        else{
            return subind++;
        }
    }
    public void insertar(int elem){
        ultimo=siguiente(ultimo);
        elementos[ultimo]=elem;
    }
    public int borrar(){
        frente=siguiente(frente);
        return elementos[frente];
    }
    public static void main (String [] args){
        CFYFM cola=new CFYFM();
        
    }
}