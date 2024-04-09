package Unit6_Array;

public class ArrayTraversal {
    public static void main(String[] args) {
        String[] strArray = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println(strArray[i]);
        }

        char[] charArray = {'i', '\'', 'm', '\n', 'a', ' ', 'b', 'o', 'y'};
        int j = 0;
        while (j < charArray.length) {
            System.out.print(charArray[j++]);
        }

        System.out.println("\n");

        for (char c : charArray) {
            c = (char) ((int) c + 1);
            System.out.print(c);
        }
        System.out.println("\n");

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println("\n");
    }
}
