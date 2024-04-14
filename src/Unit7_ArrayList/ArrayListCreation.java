package Unit7_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreation {
    public static void printList(List<Integer> integerList) {
        for (int i : integerList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // initialized as an empty List
        List<Integer> integerList = new ArrayList<>();

        // ArrayList methods
        // 1. int size()
        System.out.println("size: " + integerList.size());

        // 2. boolean add(E e)
        integerList.add(5);
        integerList.add(3);
        integerList.add(2);

        printList(integerList); // [5, 3, 2]

        // 3. void add(int index, E e)
        integerList.add(2, 4);
        printList(integerList); // [5, 3, 4, 2]

        integerList.add(3, 7);
        printList(integerList); // [5, 3, 4, 7, 2]

        integerList.add(5, 9);
//        integerList.add(9);
        printList(integerList); // [5, 3, 4, 7, 2, 9]

        // 4. E get(int index)
        System.out.println(integerList.get(2));

        // 5. E set(int index, E e)
        Integer value = integerList.set(3, 6);
        printList(integerList); // [5, 3, 4, 6, 2, 9]
        System.out.println(value);

        // 6. E remove(int index)
        value = integerList.remove(3);
        printList(integerList); // [5, 3, 4, 2, 9]
        System.out.println(value);
    }
}
