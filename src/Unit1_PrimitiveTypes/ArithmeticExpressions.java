package Unit1_PrimitiveTypes;

public class ArithmeticExpressions {
    public static void getIndexPlusOne(String s) {
        System.out.println(s.charAt(s.length()));
    }
    public static void main(String[] args) {
        // Operand - OP
        // int OP int -> int
        System.out.println(5/ 2); // 2

        // double OP double -> double
        System.out.println(6.3 / 3.0); // 2.1

        // (int OP double || double OP int) -> double
        System.out.println(8.4/2); // 4.2
        System.out.println(10/2.5); // 4.0

        System.out.println(5 / 2 + 4 * 8);
        System.out.println(5 / (2 * 2.5) + 4);

//        System.out.println(5 / 0);

        getIndexPlusOne("abc");
    }
}
