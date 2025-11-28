import java.util.Scanner;
public class ColaPromedio{
    private final int maxcola=5;
    private int ultimo,aux;
    private int []elemento;

    public ColaPromedio(){
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
    //metodo calcular promedio de la cola
    public int promedio(){
        ColaPromedio CA=new ColaPromedio();
        int suma=0, contador=0, prom=0;
        while(!this.estaVacia()){
            int valor=this.borrar();
            suma+=valor;
            contador++;
            CA.insertar(valor);
        }
        while(!CA.estaVacia()){
            this.insertar(CA.borrar());
        }
        if(contador>0){
            prom=suma/contador;
        }
        return prom;
    }
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        ColaPromedio C2=new ColaPromedio();
        int A, ent;
        do{
            System.out.println("Seleccione una opción");
            System.out.println("");
            System.out.println("1-Ingresar enteros a la cola");
            System.out.println("--------------------------------");
            System.out.println("2-Borrar enteros de la cola");
            System.out.println("--------------------------------");
            System.out.println("3-Estado de la Cola");
            System.out.println("--------------------------------");
            System.out.println("4-Calcular promedio de la cola");
            A=scanner.nextInt();

            switch (A) {
                case 1:
                    System.out.println("Ingrese un entero:");
                    ent=scanner.nextInt();
                    if (!C2.estaLlena()){
                        C2.insertar(ent);
                    }
                    else{
                        System.out.println("La cola esta llena");
                    }
                    break;
            
                case 2:

                    if(!C2.estaVacia()){
                        System.out.println("Se elimino el ultimo elemento insertado en la cola");
                        C2.borrar();
                    }
                    break;

                case 3:
                    if(!C2.estaVacia()){
                        System.out.println("La cola tiene elementos");
                    }
                    else{
                        System.out.println("La cola no tiene elementos");
                    }
                    break;
                case 4:
                    System.out.println("El promedio de la cola es: "+C2.promedio());
                    break;
            }

        }
        while (A!=0);
        scanner.close();

    }
}