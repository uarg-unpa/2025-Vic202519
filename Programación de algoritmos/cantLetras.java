public class cantLetras{
    //main
    public static void main (String[]args){
        String palabra="caravana";
        char letra='a';
        int i=0;
        int resultado=Letras(palabra, letra, i);
        if(resultado==0){
            System.out.println("La letra "+letra+" no se encuentra en la palabra ingresada");
        }
        else{
            System.out.println("La letra "+letra+" se encuentra "+resultado+" veces en la palabra");
        }
    }
    //metodo cantLetras, recibe un string y debe contar la cantidad de veces que aparece x letra en la palabra, 
    //recordar el no usar de while, for,do, while y variables locales
    public static int Letras(String pala, char x, int i){
        if(i==pala.length()){
            return 0;
        }
        if(pala.charAt(i)==x){
            return 1 + Letras(pala, x, i+1);
        }
        else{
            return Letras(pala, x, i+1);
        }
    }   
}