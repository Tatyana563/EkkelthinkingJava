package chapter15;

public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        System.out.println("testing");
Holder3<Pet> h3 = new Holder3<>(new Pet("tom"));
Pet a = h3.getA();
        System.out.println(a);
 h3.setA(new Dog("Bill"));
        System.out.println(h3.getA());
    }
}
