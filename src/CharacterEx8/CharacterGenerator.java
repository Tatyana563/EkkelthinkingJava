package CharacterEx8;

import chapter15.Coffee.Generator;
import chapter15.IterableFibonacci;

import java.util.Iterator;
import java.util.Random;

public class CharacterGenerator implements Generator<Character>, Iterable<Character> {
    private Class [] types={GoodHero.class,GoodHeroine.class, BadHero.class,BadHeroine.class};
    private static Random random = new Random();
private int size;

    public CharacterGenerator(int size) {
        this.size = size;
    }

    @Override
    public Character next() {
        try {
            return (Character) types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw  new RuntimeException();
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            @Override
            public boolean hasNext() {
                return size>0;
            }

            @Override
            public Character next() {
              size--;
              return CharacterGenerator.this.next();
            }
        };
    }
}
