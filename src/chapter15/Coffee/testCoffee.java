package chapter15.Coffee;

import java.util.Iterator;

public class testCoffee {
    public static void main(String[] args) {
        //CoffeeGenerator gen = new CoffeeGenerator();
        //for (int i = 0; i < 5; i++) {
           // System.out.println(gen.next());
            /*for (Coffee c : new CoffeeGenerator(5)) {
                System.out.println(c);
//                System.out.println("testing main branch");
//                System.out.println("testing main branch");
//                System.out.println("testing main branch");
            }*/
        CoffeeGenerator gen = new CoffeeGenerator(5);
            for (Iterator<Coffee> iterator = gen.iterator(); iterator.hasNext();) {
                Coffee c = iterator.next();
                System.out.println(c);
            }
        }
    }

