package chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruit {
}
class Apple extends Fruit{}
class smallApple extends Apple{}
class Orange extends Fruit{}
class CovarianArrays{
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0]= new Apple();
        fruit[1]= new smallApple();
       // fruit[1]=new Orange();
       // fruit[0]= new Fruit();
        System.out.println(Arrays.toString(fruit));
      //  List<Fruit> flist = new ArrayList<Apple>();
    }
}