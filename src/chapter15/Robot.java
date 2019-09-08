package chapter15;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
class HolderEx2<T>{
    private T x, y, z;

    public HolderEx2(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "HolderEx2{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Robot r1 = new Robot("rob1");
        Robot r2 = new Robot("rob2");
        Robot r3 = new Robot("rob3");
       HolderEx2<Robot> holderEx2 = new HolderEx2<>(r1,r2,r3);
        System.out.println(holderEx2);
    }
}