package strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Luan";
        String nome2 = "Luan";

        System.out.println(nome == nome2); // as duas variaveis apontam para o mesmo endereço de memoria dentro da String pool

        nome = nome.concat(" Cerqueira");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Luan");
        System.out.println(nome3);
        System.out.println(nome3 == nome2);
        System.out.println(nome3.intern() == nome2);

    }
}
