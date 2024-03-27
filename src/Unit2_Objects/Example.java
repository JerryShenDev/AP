package Unit2_Objects;

import java.util.ArrayList;

public class Example {
    // constructor: assembly line of objects, they build new objects with parameters for the object
    // public: anyone can see/use the function/parameter
    // protected: the class itself and any of its subclasses can see/use the function/parameter
    // private: only the class itself can see/use this function/parameter
    protected int integer1;

    // if your constructor does not have inputs, then it's a default constructor
    public Example(){}

    // non default constructors that have inputs, they give you the object with the parameters you want
    public Example(int integer1){
        this.integer1 = integer1;
    }


    // accessors: they tell you the value of parameters objects may have
    // their return type is the type of whatever parameter you want to look at
    // no inputs
    public int getInteger1(){
        return this.integer1;
    }


    // mutators: changes a value of an object after it's made
    // return type is almost always void
    // input is of the sane type as what you want to change
    public void setInteger1(int integer1){
        this.integer1 = integer1;
    }

    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){

    }

}
