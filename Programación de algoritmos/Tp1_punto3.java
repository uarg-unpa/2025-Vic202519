public class Tp1_punto3{
    public static void main (String[]args){
        int A=3;
        int B=2;
        int C=7;
        int vaux;

        vaux=C;
        B=A;
        C=A;
        A=vaux;

        System.out.print("Su variable A es: "+A);
        System.out.print("Su variable B es: "+B);
        System.out.print("Su variable C es: "+C);
    }
}