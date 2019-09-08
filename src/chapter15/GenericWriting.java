package chapter15;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
    static <T> void writeExact(List<T> list, T item){
       list.add(item);
        System.out.println(list);
    }
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit>fruits = new ArrayList<>();
    static void f1(){
        writeExact(apples, new Apple());
        writeExact(fruits, new Apple());
    }
    static <T> void writeWithWildcards(List<? super T>list, T item){
       list.add(item);
        System.out.println(list);
    }
    static void f2(){
        writeWithWildcards(apples, new Apple());
        writeWithWildcards(fruits,new Apple());
    }

    public static void main(String[] args) {
        f1();
    }
}
