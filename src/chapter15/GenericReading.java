package chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericReading {
    static <T> T readExect(List<T> list) {
        return list.get(0);
    }

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruits = Arrays.asList(new Fruit());
    static List<smallApple> smallApples =Arrays.asList(new smallApple());

    static void f1() {
        Apple a = readExect(apples);
        Fruit f = readExect(fruits);
        f = readExect(apples);
        f=readExect(smallApples);
        // a= readExect(fruits);
        System.out.println(a);
        System.out.println(f);
    }

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }

        static void f2() {
            Reader<Fruit> fruitReader = new Reader<>();
            Fruit f = fruitReader.readExact(fruits);
            System.out.println(f);
            // Fruit a = fruitReader.readExact(apples); problem
        }


        static class CovarianReader<T> {
            T readCovariant(List<? extends T> list) {
                return list.get(0);
            }

            static void f3() {
                CovarianReader<Fruit> fruitReader = new CovarianReader<>();
                Fruit f = fruitReader.readCovariant(fruits);
                Fruit a = fruitReader.readCovariant(apples);
                Fruit s= fruitReader.readCovariant(smallApples);
                System.out.println(a);
                System.out.println(f);
                System.out.println(s);
            }


            public static void main(String[] args)
            {
                f1();
            }

        }
    }
}


