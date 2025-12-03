import java.util.Scanner;

/*Tengo que hacer una cola de frente fijo final movible, donde se ingresan caracteres
y tengo que hacer uso del metodo peek y retornar el caracteres que esta en el frente sin desencolarlo*/

//cola Frente fijo final movible

public class ColaFFFM{
    private final int maxcola=5;
    private int ultimo,aux;
    private int []elemento;

    public ColaFFFM(){
        elemento=new int[maxcola];
        ultimo=-1;
    }
    public boolean estaLlena(){
        return(ultimo==maxcola-1);
    }
    public boolean estaVacia(){
        return(ultimo==-1);
    }
    public void insertar(int elem){
        if(!this.estaLlena()){
            ultimo++;
            elemento[ultimo]=elem;
        }
    }
    public int borrar(){
        aux=elemento[0];
        for(int i=0;i<ultimo;i++){
            elemento[i]=elemento[i+1];
        }
        ultimo--;
        return aux;
    }
    // Metodo peek
    //Muestra el ultimo elemento que fue insertado en la Cola/pila, util en momentos donde se debe saber el ulitmo numero sin desencolar
    public int peek(){
        return elemento[ultimo];
    }
    
    //Main

    public static void main (String[]args){
        int A;
        int caracter;
        Scanner lectura= new Scanner(System.in);
        ColaFFFM C1= new ColaFFFM();
        do{
            System.out.println("Seleccione una opción");
            System.out.println("");
            System.out.println("1-Ingresar caracteres a la cola");
            System.out.println("--------------------------------");
            System.out.println("2-Borrar caracteres de la cola");
            System.out.println("--------------------------------");
            System.out.println("3-Estado de la Cola");
            System.out.println("--------------------------------");
            System.out.println("4-Elemento en el frente (Peek)");
            A=lectura.nextInt();

            switch (A) {
                case 1:
                    System.out.println("Ingrese un caracterer:");
                    caracter=lectura.nextInt();
                    if (!C1.estaLlena()){
                        C1.insertar(caracter);
                    }
                    else{
                        System.out.println("La cola esta llena");
                    }
                    break;
            
                case 2:
                    
                    if(!C1.estaVacia()){
                        System.out.println("Se elimino el ultimo elemento insertado en la cola");
                        C1.borrar();
                    }
                    break;

                case 3:
                    if(!C1.estaVacia()){
                        System.out.println("La cola tiene elementos");
                    }
                    else{
                        System.out.println("La cola no tiene elementos");
                    }
                    break;
                case 4:
                    System.out.println("El caracter que esta en el frente es: "+C1.peek());
                    break;
            }

        }
        while (A!=0);
        lectura.close();
    }
}

