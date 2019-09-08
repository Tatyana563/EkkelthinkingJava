package chapter15;

import java.util.List;

public class SuperTypesWildCards {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new smallApple());
    }
}
