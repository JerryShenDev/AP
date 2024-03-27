package Unit2_Objects;

import java.util.ArrayList;

public class Inheritor extends Example{
    private String str1;
    public Inheritor(int integer1, String str1){
        super(integer1);
        this.str1 = str1;
    }

    public String getStr1(){
        return str1;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public int add(int a, int b){
        return a+b+99;
    }
}
