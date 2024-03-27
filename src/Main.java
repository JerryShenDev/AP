import Unit2_Objects.Example;
import Unit2_Objects.Inheritor;
import Unit2_Objects.Inheritor2;
import Unit2_Objects.Tea;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        /*
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        Example e1 = new Example(1, arr1);
        System.out.println(e1.getListOfInts());
        e1.changeElement(1, 9);
        System.out.println(e1.getListOfInts());

        // make new object: ClassName objectName = new ClassName();
        // call whatever function you need with objectName.functionName(parameters);
        Tea bottle = new Tea("Green Tea", 100);
        System.out.println(bottle.getVol());
        bottle.drink(2);
        System.out.println(bottle.getVol());

         */

        // the superclass cannot use the subclasses' parameters and methods
        // the subclass can use its own and its superclasses' parameters and methods
        Inheritor i1 = new Inheritor(1,"abcde");
        System.out.println(i1.getInteger1());
        System.out.println(i1.getStr1());
        Example e1 = new Example(1);
        System.out.println(e1.getInteger1());
        // System.out.println(e1.getStr1());

        // constructors are the opposite, superclasses can use subclass constructors
        // subclasses cannot use superclass constructors
        Example e2 = new Example();
        // Inheritor i2 = new Example(1);
        Inheritor s = new Inheritor(1, "aaaaa");
        System.out.println(s.add(1, 2));
    }
}