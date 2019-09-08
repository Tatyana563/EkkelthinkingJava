package chapter15;

public class TupleTest {
    public  static TwoTuple<String,Integer> f(){
        return new TwoTuple<>("hi",10);
    }
    public static ThreeTuple<Pet,String,Integer> g(){
        return new ThreeTuple<>(new Pet("Grey"),"Hello",54);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
    }
}
