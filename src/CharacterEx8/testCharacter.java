package CharacterEx8;

public class testCharacter {
    public static void main(String[] args) {
       for(Character c: new CharacterGenerator(5)){
           System.out.println(c);
       }

    }
}
