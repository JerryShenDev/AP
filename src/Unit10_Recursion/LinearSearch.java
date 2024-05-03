package Unit10_Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static boolean linearSearchRecursion(ArrayList<Integer> integerList, int curr, int tar) {
        // base case
        if (curr == integerList.size() - 1) {
            return tar == integerList.get(curr);
        }

        // recursion case
        return tar == integerList.get(curr) || linearSearchRecursion(integerList, curr + 1, tar);
    }
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            int val = (int) (Math.random() * 10 + 1);
            integerArrayList.add(val);
            System.out.print(val + "\t");
        }

        System.out.println(linearSearchRecursion(integerArrayList, 0, 6));
    }
}
