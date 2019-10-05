package chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Objects> list3;
    static  void assign1(List list){
        list1=list;
        list2=list;
        list3=list;//????
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
    static void assign2(List<?>list){
        list1=list;
        list2=list;
       //list3=list;
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }

    static void assign3(List<? extends Objects> list) {
        list1 = list;
        list2 = list;
        list3 = list;
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
    static <T> void assign4(List<T> list) {
        list1 = list;
        list2 = list;
      //   list3=list;//????

    }
    public static void main(String[] args) {
        assign3(new ArrayList());
        System.out.println("test");
        System.out.println("test2");
    }
}

