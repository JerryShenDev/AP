package Unit7_ArrayList;

public class PassArrayToMethod {

    public static void printStringArray(String[] stringArray) {
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void modify(String[] stringArray) {
        int size = stringArray.length;
        if (size > 0) {
            stringArray[size - 1] = "new value";
        } else {
            System.out.println("do nothing");
        }
    }

    public static void modifyReference(String[] stringArray) {
        stringArray = new String[3];
        stringArray[0] = "item_1";
        stringArray[1] = "item_2";
        stringArray[2] = "item_3";
    }

    public static void main(String[] args) {
        String[] stringArray = new String[3];

        // try to modify array directly
        printStringArray(stringArray);
        modify(stringArray);
        printStringArray(stringArray);

        // try to modify the reference/address of the array
        printStringArray(stringArray);
        modifyReference(stringArray);
        printStringArray(stringArray);
    }
}
