public class Libro{
    public int paginas;
    public String autor, titulo, genero;

    public Libro (int pag, String aut, String tit, String gen){
        this.paginas=pag;
        this.autor=aut;
        this.titulo=tit;
        this.genero=gen;
    }
    public void setPaginas(int pag){
        this.paginas=pag;
    }
    public int getPaginas(){
        return paginas;
    }
    public void setAutor(String aut){
        this.autor=aut;
    }
    public String getAutor(){
        return autor;
    }
    public void setTitulo(String tit){
        this.titulo=tit;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setGenero(String gen){
        this.genero=gen;
    }
    public String getGenero(){
        return genero;
    }

    public void mostrarDatos1(){
        System.out.println("Nombre del autor: "+this.autor);
        System.out.println("Nombre del libro: "+this.titulo);
        System.out.println("Numero de páginas: "+this.paginas);
        System.out.println("Genero del libro: "+this.genero);
    }
    public static void main (String[]args){
        Libro l1= new Libro(199,"Stephen King","Carrie","Ciencia ficción, poderes psíquicos");
        l1.mostrarDatos1();
    }

}