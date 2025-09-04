public class Telefono{
    public int nrotel;
    public double precio;
    public String marca, tiplinea;

    public Telefono(int nro, double pre, String mar, String tip){
        this.nrotel=nro;
        this.precio=pre;
        this.marca=mar;
        this.tiplinea=tip;
    }
    public void setNrotel(int nro){
        this.nrotel=nro;
    }
    public int getNrotel(){
        return nrotel;
    }
    public void setPrecio(double pre){
        this.precio=pre;
    }
    public double getPrecio(){
        return precio;
    }
    public void setMarca(String mar){
        this.marca=mar;
    }
    public String getMarca(){
        return marca;
    }
    public void setTiplinea(String tip){
        this.tiplinea=tip;
    }
    public String getTiplinea(){
        return tiplinea;
    }
    public void mostrarTelefono(){
        System.out.println("La marca de este telefono es: "+this.marca);
        System.out.println("La linea es: "+this.tiplinea);
        System.out.println("Numero de telefono: "+this.nrotel);
        System.out.println("Precio: "+this.precio);
    }
    public static void main (String[]args){
        Telefono t1= new Telefono(296612345,300.99,"Motorola","Movistar");
        t1.mostrarTelefono();
    }
}