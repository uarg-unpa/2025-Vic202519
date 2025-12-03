import java.util.Scanner;
public class PilaEnteros{
    //tengo que hacer una pila de enteros, donde los numeros menores al valor ingresado por el usuario, se eliminen
    //dejando solo los valores mayores o iguales al numero ingresado por el usuario, ademas de contar la cantidad de numeros eliminados
    //y acomodar los numeros que quedaron en orden de menor a mayor
    private final int maxpila1=10;
    private int [] elemento1;
    private int cima1;

    public PilaEnteros(){
        elemento1=new int[maxpila1];
        cima1=-1;
    }
    public boolean estaVacia1(){
        return (cima1==-1);
    }
    public boolean estaLlena1(){
        return (cima1==maxpila1-1);
    }
    public void meter1(int e){
        cima1=cima1+1;
        elemento1[cima1]=e;
    }
    public int sacar(){
        int aux=elemento1[cima1];
        cima1=cima1-1;
        return aux;
    }
    public int devolverCima1(){
        return cima1;
    }
    //metodo para eliminar los numeros menores a un valor dado
    public int eliminar(int numero1){
        PilaEnteros auxPila1=new PilaEnteros();
        int cont=0,aux,aux2;
        while (!this.estaVacia1()) {
            aux=this.sacar();
            if (aux<numero1){
                cont++;
            }
            else{
                auxPila1.meter1(aux);
            }
        }
        while (!auxPila1.estaVacia1()) {
            aux2=auxPila1.sacar();
            if(aux2>=numero1){
                this.meter1(aux2);
            }
        }
        return cont;
    }
    public static void main (String[]args){
        PilaEnteros P2= new PilaEnteros();
        Scanner Scanner2=new Scanner(System.in);
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
            A=Scanner2.nextInt();

            switch (A) {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    numero=Scanner2.nextInt();
                    if (!P2.estaLlena1()){
                        P2.meter1(numero);
                    }
                    else{
                        System.out.println("La cola esta llena");
                    }
                    break;
            
                case 2:
                    
                    if(!P2.estaVacia1()){
                        System.out.println("Se elimino el ultimo elemento insertado en la cola");
                        P2.sacar();
                    }
                    break;

                case 3:
                    System.out.println("El nivel actual esta en: "+P2.devolverCima1());
                    break;

                case 4:
                    System.out.print("Ingrese el valor: ");
                    int num2=Scanner2.nextInt();
                    int eliminados=P2.eliminar(num2);
                    System.out.println("Se eliminaron "+eliminados+" elementos menores a "+num2);
                    break;
            }
        }
        while (A!=0);
        Scanner2.close();
    }
}