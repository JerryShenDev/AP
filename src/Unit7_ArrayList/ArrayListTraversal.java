package Unit7_ArrayList;

import Unit5_Writing_Classes.Circle;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTraversal {
    public static void printList(List<Circle> circleList) {
        System.out.print("{");
        for (Circle c : circleList) {
            System.out.print(c + ", ");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();

        // randomly assign radius for circles
        for (int i = 0; i < 5; i++) {
            int radius = (int) (Math.random() * 5);
            Circle circle = new Circle(radius);
            circleList.add(circle);
//            circleList.add(new Circle((int) (Math.random() * 5)));
        }

        printList(circleList);

        // accidentally skip element for removing during the loop
//        for(int i = 0; i < circleList.size(); i++) {
//            // if radius is odd number -> delete
//            if (circleList.get(i).getRadius() % 2 == 1) {
//                circleList.remove(i);
//            }
//        }

        int i = 0;
        while (i < circleList.size()) {
            // if radius is odd number -> delete
            // don't update i since after removal
            // the element already shifted ahead
            if (circleList.get(i).getRadius() % 2 == 1) {
                circleList.remove(i);
            } else {
                i++;
            }
        }

        printList(circleList);

        // ConcurrentModificationException
        // why remove() works sometime ??
        for (Circle c : circleList) {
//            circleList.add(new Circle());
            circleList.remove(0);
        }
    }
}
