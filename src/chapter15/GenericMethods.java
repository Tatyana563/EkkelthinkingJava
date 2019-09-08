package chapter15;

public class GenericMethods {
    public<T, U, V> void f (T x, U y, V z){
        System.out.println(x.getClass().getSimpleName()+y.getClass().getSimpleName()+z.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("apple",5,'c');
    }
}
