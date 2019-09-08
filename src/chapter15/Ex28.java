package chapter15;


    public class Ex28 {
      static  class Generic1<T> {
            T t;
            void take(T t) { this.t = t;
                System.out.println(t);}
        }
        // note that generic type T in Generic1 is not the same as type T in Generic2
    static  class Generic2<T> {
T t;
            T give() {
                System.out.println(t);
                return t; }
        }
        <T> void contra(Generic1<? super T> g1t, T t)
        {
            g1t.take(t);
        }
        <T> T co(Generic2<? extends T> g2t) {
            return g2t.give();
        }
        public static void main(String[] args) {
            Ex28 e28 = new Ex28();
            Generic1<Fruit> generic1 = new Generic1<>();
            Generic2<Fruit> generic2 = new Generic2<>();
           // e28.contra(generic1,new Apple());
            e28.co(generic2);
          //  e28.contra(e28.new Generic1<Fruit>(), new smallApple());
          //  e28.co(e28.new Generic2<Fruit>());
        }
    }

