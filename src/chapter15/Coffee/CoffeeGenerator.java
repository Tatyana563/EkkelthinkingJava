package chapter15.Coffee;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{

    private Class[] types = {Latte.class, Cappuccino.class, Americano.class};
    private static Random random = new Random();

    public CoffeeGenerator() {

    }

    private int size = 0;

    public CoffeeGenerator(int sz) {
        size = sz;
    }

    public Coffee next() {
        try {

            // Latte l = new Latte();
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override//реал ан класса new Iterator<Coffee> и вызов констр
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            @Override
            public boolean hasNext() {
                return size>0;
            }

            @Override
            public Coffee next() {
                size--;
                return CoffeeGenerator.this.next();
            }

            @Override
            public void remove() {

            }
        };
    }


//    @Override
//    public Iterator<Coffee> iterator() {
//        return new CoffeeIterator();
//    }


//    class CoffeeIterator implements Iterator<Coffee> {
//        int count = size;
//
//        @Override
//        public boolean hasNext() {
//            return count > 0;
//        }
//
//        @Override
//        public Coffee next() {
//            count--;
//            return CoffeeGenerator.this.next();
//        }
//
//        public Iterator<Coffee>iterator(){
//            return new CoffeeIterator();
//        }
//    }

}
