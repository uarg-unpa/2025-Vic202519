public class Alumno{
    private String nombre, apellido;
    private int edad, dni;

    public Alumno (String nom,String ape, int eda, int dn){
        this.nombre=nom;
        this.apellido=ape;
        this.edad=eda;
        this.dni=dn;
    }
    public void setnombre(String nom){
        this.nombre=nom;
    }
    public String getnombre(){
        return nombre;
    }
    public void setapellido(String ape){
        this.apellido=ape;
    }
    public String getapellido(){
        return apellido;
    }
    public void setedad(int eda){
        this.edad=eda;
    }
    public int getedad(){
        return edad;
    }
    public void setdni(int dn){
        this.dni=dn;
    }
    public int getdni(){
        return dni;
    }

    public void mostrarDatos(){
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Apellido:"+this.apellido);
        System.out.println("Edad:"+this.edad);
        System.out.println("Dni:"+this.dni);
    }
    public static void main (String[]args){
        Alumno a1= new Alumno("Juan", "Viscido", 18, 46854712);
        a1.mostrarDatos();
    }
    
}