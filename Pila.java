public class Pila{
    private int maxPila = 10;
    private int cima = -1;
    private int cont = 0;
    private int elementos[];

    public Pila() {
        elementos = new int[maxPila];
        cima = -1;
    }

    public boolean estaVacia() {
        return (cima == -1);
    }

    public void meter(int elem) {
        cima++;
        elementos[cima] = elem;
    }

    public int sacar() {
        int sacar = elementos[cima--];
        return sacar;
    }

    public void borrar(int x){
        int elementos[] = new int[maxPila];
        Pila aux = new Pila();
        int elem = 0;
        int aux2 = 0;
        boolean ok = false;
        int cont = 1;

        while (!this.estaVacia()) {
            aux2 = this.sacar();
            if (aux2 == x) {
                ok = true;
                elem = aux2;
            } else {
                aux.meter(aux2);
                cont++;
            }
        }

        while (!aux.estaVacia()){
            this.meter(aux.sacar());
        }

        if (ok){
            System.out.println("Se elimino el " + elem + " y se movieron " + cont);
        } else {
            System.out.println("No se encontro el elemento.");
        }
    }
}
