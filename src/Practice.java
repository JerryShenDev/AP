public class Practice {
    public static void modify2(Integer a) {
        a -= 3;
    }
    public static void modify(int a) {
        a += 5;
        Integer b = 8;
        modify2(b);
        System.out.println(b);
        a = b;
    }
    public static void main(String[] args) {
        int a = 3;
        modify(a);
        System.out.println(a);
    }
}
