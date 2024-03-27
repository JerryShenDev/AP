package Unit2_Objects;

public class StringMain {
    public static void main(String[] args) {
        String s = new String("abc");
        String s2 = "def";
        String concat = s + s2;
        concat += "g"; // resulting a new String object
        System.out.println(concat); // abcdefg

        // primitive concat with String
        s = "this is number " + 1;
        s = ".." + 'c';
        s = ".." + true;
        System.out.println(s);

        // escape character
        System.out.println("1st" + '\n' + "2nd");
        System.out.println("1" + "\t" + "2");
        char backSlash = '\\';
        System.out.println(backSlash);
        char singleQuote = '\'';
        System.out.println(singleQuote);

        String doubleQuote = "\"str\"";
        System.out.println(doubleQuote);

    }
}
