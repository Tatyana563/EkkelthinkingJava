package chapter15;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
  private Random rand = new Random();
  public void add(T item){
      storage.add(item);
  }
  public T select(){
      return storage.get(rand.nextInt(storage.size()));
  }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<>();

        for (String s : ("The quick brown fox jumped over").split(" ")) {
            randomList.add(s);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(randomList.select());
        }
        RandomList<Integer> randomList1 = new RandomList<>();
        for (int i = 0; i < 10; i++) {
            randomList1.add(i);
        }
        for (int i = 0; i < 4; i++) {
            randomList1.select();
            System.out.println( randomList1.select());
        }
        RandomList<Pet> randomList2 = new RandomList<>();
        Pet p1 = new Pet("Murka");
        Pet p2 = new Pet("Jack");
        Pet p3 = new Pet("Tom");
        randomList2.add(p1);
        randomList2.add(p2);
        randomList2.add(p3);
        for(int i=0;i<3;i++){
            System.out.println(randomList2.select().name);
        }

    }
}
