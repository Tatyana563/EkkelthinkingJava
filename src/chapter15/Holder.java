package chapter15;

public class Holder<T> {
   private T value;
   public Holder(){}

    public Holder(T value) {
        this.value = value;
    }
    public void set(T val){
       value=val;
   }
   public T get(){
       return value;
   }
   public boolean equals(Object object){
       return value.equals(object);
   }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<Apple>(new Apple());
        Apple d = Apple.get();
        System.out.println(d);
        Apple.set(d);
       // Holder<Fruit> Fruit = Apple;
        Holder<? extends Fruit> fruit = Apple;
        Fruit p = fruit.get();
        System.out.println("p:"+p);
        d= (Apple) fruit.get();
        System.out.println(d);
       // Orange c = (Orange) fruit.get();
        //System.out.println(c);
       // fruit.set(new Apple());
        System.out.println(fruit.equals(d));
    }
}
