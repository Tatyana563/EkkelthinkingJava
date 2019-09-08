package CharacterEx8;

public class Character {
    private static long counter=0;
    private final long id=counter++;
    public String toString(){
        return getClass().getSimpleName()+""+id;
    }
}
