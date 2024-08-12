package wrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {

        //tipos primitivos
        byte byteP = 1;
        short shorP = 1;
        long longP = 1L;
        int intP = 1;
        float floatP = 1F;
        double doubleP = 1.0D;
        char charP = '1';
        boolean booleanP = true;

        //Classes
        Byte byteW = 1;
        Short shorW = 1;
        Long longW = 1L;
        Integer intW = 1; //autoboxing do tipo primitivo para o wrapper
        Float floatW = 1F;
        Double doubleW = 1.0D;
        Character charW = '1';
        Boolean booleanW = true;

        int i = intW; //unboxing de um wrapper para um tipo primitivo
    }
}
