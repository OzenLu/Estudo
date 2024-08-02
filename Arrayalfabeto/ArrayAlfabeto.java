package Arrayalfabeto;

public class ArrayAlfabeto {

    public static void pegarLetras(int x){
        char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l',
                'm','n','o','p','q','r','s','t','u','v','w','x','y','z',};

        if( x < 1 || x > 26){return;}

        for(int y = 0; y < x; y++){
            System.out.println(alfabeto[y]);
        }
    }

    public static void main(String[] args) {
        pegarLetras(26);
    }
}
