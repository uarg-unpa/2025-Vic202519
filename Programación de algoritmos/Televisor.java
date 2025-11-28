import java.util.Scanner;
public class Televisor{
    //la clase debe tener para encender, apagar, subir y bajar el canal, subir y bajar el volumen, y volver al programa antes seleccionado
    private boolean boton;
    private int volumen, canal, retorno;
    
    public Televisor(boolean boton){
        this.boton=boton;
        volumen=10;
        canal=1;
        retorno=canal;
    }
    public void setBoton(boolean bo){
        this.boton=bo;
    }
    public void setVolumen(int vo){
        this.volumen=vo;
    }
    public void setCanal(int ca){
        this.canal=ca;
    }
    public boolean getBoton(){
        return boton;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;
    }
    public void retorno(){
        canal=retorno;
    }
    public static void main (String[]args){
        Scanner read= new Scanner(System.in);
        Televisor T1;
        boolean bandera1 = true,bandera2 = true;
        String A;
        int B=0,C=0,D=0;
        while (bandera1){
            System.out.println("¿Desea encender el televisor? (S/N)");
            A = read.nextLine();
            switch (A){
                case "Si":
                    while (bandera1){
                        while (bandera2){
                            System.out.println(
                            "\n 1 - Cambiar canal" +
                            "\n 2 - Mostrar canal" +
                            "\n 3 - Cambiar volumen"+
                            "\n 4 - Mostrar volumen"+
                            "\n 5 - Retornar"+
                            "\n 6 - Apagar televisor");
                            B = read.nextInt();
                    
                            switch (B){
                                case 1:
                                    System.out.println("¿A que canal desea ir?: ");
                                    C=read.nextInt();
                                    while (C<1||C>99){
                                    System.out.println("Seleccione un canal valido, entre 1 y 99: ");
                                    C=read.nextInt();
                                    System.out.println("Se selecciono el canal: "+C);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Usted esta en el canal: "+C);
                                    break;
                                case 3:
                                    System.out.println("¿que volumen desea ingresar?: ");
                                    D=read.nextInt();
                                    System.out.println("Ahora el televisor esta en: %"+D);
                                    while (D<1||D>99){
                                        System.out.println("Seleccione un volumen valido, entre 1% y 99%: ");
                                        D=read.nextInt();
                                        break; 
                                    }
                                case 4:
                                    System.out.println("El Volumen actual es de: %"+D);
                                    break;
                                case 5:
                                    //debo pensar que puedo hacer para retornar
                                    System.out.println("Retorno y ahora esta en el canal:");
                                    break;
                                case 6:
                                    System.out.println ("El televisor esta apagado.");
                                    bandera2=false;
                                    break;
                            } 
                        }
                    }
                    break;
            
                case "No":
                    System.out.println("El televisor esta apagado.");
                    bandera1=false;
                    break;
            }

        
        }
        read.close();
    }
}