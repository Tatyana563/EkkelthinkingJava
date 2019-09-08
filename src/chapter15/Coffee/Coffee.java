package chapter15.Coffee;

public class Coffee {
   private static long counter=0;
   private final long id= counter++;
   public String tostring(){
       return getClass().getSimpleName()+""+id;
   }

}
