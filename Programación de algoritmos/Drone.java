public class Drone{
    public String empresa, modelo, pedido;
    public int bateria, bateriaActual;
    public double pesoMAX, alturaMAX, pesoActual, alturaActual;

    public Drone (String emp, String mod, int bat, double peso, double altura, double pesoA, double alturaA, int bateriaA, String pe){
        this.empresa=emp;
        this.modelo=mod;
        this.bateria=bat;
        this.pesoMAX=peso;
        this.alturaMAX=altura;
        this.pesoActual=pesoA;
        this.alturaActual=alturaA;
        this.bateriaActual=bateriaA;
        this.pedido=pe;
    }
    public void setempresa(String emp){
        empresa=emp;
    }
    public String getempresa(){
        return empresa;
    }
    public void setmodelo(String mod){
        modelo=mod;
    }
    public String getmodelo(){
        return modelo;
    }
    public void setbateria(int bat){
        bateria=bat;
    }
    public int getbateria(){
        return bateria;
    }
    public void setpesoMAX(double peso){
        pesoMAX=peso;
    }
    public double getpesoMAX(){
        return pesoMAX;
    }
    public void setalturaMAX(double altura){
        alturaMAX=altura;
    }
    public double getalturaMAX(){
        return alturaMAX;
    }
    public void setpesoActual(double pesoA){
        pesoActual=pesoA;
    }
    public double getpesoActual(){
        return pesoActual;
    }
    public void setalturaActual(double alturaA){
        alturaActual=alturaA;
    }
    public double getalturaActual(){
        return alturaActual;
    }
    public void setbateriaActual(int bateriaA){
        bateriaActual=bateriaA;
    }
    public int getbateriaActual(){
        return bateriaActual;
    }
    public void setpedido(String pe){
        pedido=pe;
    }
    public String getpedido(){
        return pedido;
    }

    public void Despegar(){
        if(this.bateria>=20|this.bateria<=100){
            System.out.println("El drone esta en condiones de despegar");
        }
        else{
            System.out.println("El drone no esta en condiciones de despegar");
        }
    }
    public void viaje(){
        //pensar mejor para viaje
    }
    public void informe(String pe){
        pe=this.pedido;
        System.out.println("La bateria actual del drone es de: "+this.bateriaActual);
        System.out.println("El peso actual que transporta del dron es de: "+this.pesoActual);
        System.out.println("La altura actual del dron es de: "+this.bateriaActual);

        if(pe=="S"){
            System.out.println("El pedido fue entregado!");
        }
        else{
            System.out.println("El pedido no fue entregado");
        }
    }
    public static void main (String[]args){
        Drone D1=new Drone("Dronde Studios","MX420",100,3,10,1.5,8.5,70,"N");

    }
}