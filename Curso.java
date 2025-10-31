public class Curso{
    public int duracion;
    public String titulo1, profesor, modalidad;

    public Curso(int dura, String tit1, String prof, String moda){
        this.duracion=dura;
        this.titulo1=tit1;
        this.profesor=prof;
        this.modalidad=moda;
    }
    
    public void setDuracion(int dura){
        this.duracion=dura;
    }
    public int getDuracion(){
        return duracion;
    }
    public void setTitulo1(String tit1){
        this.titulo1=tit1;
    }
    public String getTitulo1(){
        return titulo1;
    }
    public void setProfesor(String prof){
        this.profesor=prof;
    }
    public String getProfesor(){
        return profesor;
    }
    public void setModalidad(String moda){
        this.modalidad=moda;
    }
    public String getModalidad(){
        return modalidad;
    }
    public void mostrarCurso(){
        System.out.println("Titulo: "+this.titulo1);
        System.out.println("Duración del curso: "+this.duracion+" meses");
        System.out.println("Nombre del Profesor: "+this.profesor);
        System.out.println("Modalidad del curso: "+this.modalidad);
    }

    public static void main (String[]args){
        Curso c1= new Curso(6,"Ingles","Juan Viscido","Virtual");
        c1.mostrarCurso();
    }
}