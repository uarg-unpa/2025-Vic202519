import java.util.Scanner;
public class PilaEnteros{
    //tengo que hacer una pila de enteros, donde los numeros menores al valor ingresado por el usuario, se eliminen
    //dejando solo los valores mayores o iguales al numero ingresado por el usuario, ademas de contar la cantidad de numeros eliminados
    //y acomodar los numeros que quedaron en orden de menor a mayor
    private final int maxpila=10;
    private int [] elemento;
    private int cima;

    public PilaEnteros(){
        elemento=new int[maxpila];
        cima=-1;
    }
    public boolean estaVacia(){
        return (cima==-1);
    }
    public boolean estaLlena(){
        return (cima==maxpila-1);
    }
    public void meter(int e){
        cima=cima+1;
        elemento[cima]=e;
    }
    public int sacar(){
        int aux=elemento[cima];
        cima=cima-1;
        return aux;
    }
    //metodo para eliminar los numeros menores a un valor dado
    public int eliminarMenores(int numero1){
        PilaEnteros auxPila=new PilaEnteros();
        int cont=0,aux,aux2;
        while (!this.estaVacia()) {
            aux=this.sacar();
            if (aux<numero1){
                cont++;
            }
            else{
                auxPila.meter(aux);
            }
        }
        while (!auxPila.estaVacia()) {
            aux2=auxPila.sacar();
            if(aux2>=numero1){
                this.meter(aux2);
            }
        }
        return cont;
    }
    public static void main (String[]args){
        PilaNiveles P2= new PilaNiveles();
        Scanner Scanner=new Scanner(System.in);
        int numero, A;
        do{
            System.out.println("Seleccione una opción");
            System.out.println("");
            System.out.println("1-Ingresar enteros a la Pila");
            System.out.println("--------------------------------");
            System.out.println("2-Borrar enteros de la Pila");
            System.out.println("--------------------------------");
            System.out.println("3-Posición Actual");
            System.out.println("--------------------------------");
            System.out.println("4-Eliminación de un valor y conteo de apariciones");
            A=Scanner.nextInt();

            switch (A) {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    numero=Scanner.nextInt();
                    if (!P2.estaLlena()){
                        P2.meter(numero);
                    }
                    else{
                        System.out.println("La cola esta llena");
                    }
                    break;
            
                case 2:
                    
                    if(!P2.estaVacia()){
                        System.out.println("Se elimino el ultimo elemento insertado en la cola");
                        P2.sacar();
                    }
                    break;

                case 3:
                    System.out.println("El nivel actual esta en: "+P2.devolverCima());
                    break;

                case 4:
                    System.out.print("Ingrese el valor: ");
                    int num2=Scanner.nextInt();
                    int eliminados=P2.eliminarMenores(num2);
                    System.out.println("Se eliminaron "+eliminados+" elementos menores a "+num2);
                    break;
            }
            //arriba lo que ocurre es que, cuando ingresamos el numero que queremos ver cuantas veces se repite
            //se ingrese dentro del metodo para hacer la comparacion de los elementos de la pila con el elemento buscado
            //y la cantidad de veces que aparezca ese numero, queda guardado en la variable de apariciones

        }
        while (A!=0);
        Scanner.close();
    }
}