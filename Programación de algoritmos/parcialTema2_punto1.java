import java.util.Scanner;
/*1- Debo crear un metodo de la clase pila de enteros, donde reciba otra pila de enteros P2, ademas de calcular y retornar verdadero
si la pila P1 tiene mas elementos pares que la pila P2 y falso si P2 tiene mas elementos pares, también debe quedar como estaba originalmente*/

/*2- Desde el metodo main, dadas dos pilas de caracteres P1y P2 de igual cantidad de elementos, tengo que generar una cola de caracteres Q1
resultante de intercalar los elementos de ambas pilas*/

public class parcialTema2_punto1{
    private final int maxpila=5;
    private int cima;
    private int[] elementos;

    parcialTema2_punto1(){
        cima=-1;
        elementos=new int[maxpila];
    }
    public boolean estaVacia(){
        return (cima==-1);
    }
    public void meter(int elem){
        cima++;
        elementos[cima]=elem;
    }
    public int sacar(){
        int aux=elementos[cima];
        cima--;
        return aux;
    }
    public boolean estaLlena(){
        return (cima==maxpila-1);
    }

    //metodo para contar la cantidad de pares en ambas pilas
    public boolean masElementosPares(parcialTema2_punto1 P2){
        int cont1=0, cont2=0, aux;
        parcialTema2_punto1 Paux1=new parcialTema2_punto1();
        while(!this.estaVacia()){
            aux=this.sacar();
            if (aux%2==0){
                cont1++;
            }
            Paux1.meter(aux);
        }
        while(!Paux1.estaVacia()){
            this.meter(Paux1.sacar());
        }
        while(!P2.estaVacia()){
            aux=P2.sacar();
            if (aux%2==0){
                cont2++;
            }
            Paux1.meter(aux);
        }
        while(!Paux1.estaVacia()){
            P2.meter(Paux1.sacar());
        }
        if (cont1>cont2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main (String[]args){
        Scanner leer=new Scanner(System.in);
        parcialTema2_punto1 P1=new parcialTema2_punto1();
        parcialTema2_punto1 P2=new parcialTema2_punto1();

        int numero, A;
        do{
            System.out.println("Seleccione una opción");
            System.out.println("");
            System.out.println("1-Ingresar enteros a la Pila P1");
            System.out.println("--------------------------------");
            System.out.println("2-Ingresar elementos a la Pila P2");
            System.out.println("--------------------------------");
            System.out.println("3-Intercalar ambas pilas en una cola");
            System.out.println("--------------------------------");
            A=leer.nextInt();

            switch (A) {
                case 1:
                    System.out.println("Ingrese un numero para P1:");
                    numero=leer.nextInt();
                    if (!P1.estaLlena()){
                        P1.meter(numero);
                    }
                    else{
                        System.out.println("La pila esta llena");
                    }
                    break;
            
                case 2:
                    System.out.println("Ingrese un numero para P2:");
                    numero=leer.nextInt();
                    if (!P2.estaLlena()){
                        P2.meter(numero);
                    }
                    else{
                        System.out.println("La pila esta llena");
                    }
                    break;

                case 3:
                    System.out.println("La pila que tiene mas elementos pares es: "+P1.masElementosPares(P2));
                    break;
            }
        }
        while (A!=0);
        leer.close();
    }
}