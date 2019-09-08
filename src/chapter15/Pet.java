package chapter15;

public class Pet {
    String name;
    @Override
    public String toString() {
        return "Pet{}";
    }

    public Pet(String name) {
        this.name = name;
    }
}
