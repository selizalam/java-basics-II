import java.util.*;
public class Main {
    public static void main(String[] args){
        var animal = new ArrayList<Animal>();

        var tiger = new Tiger();
        var panda = new Panda();
        var dog = new Dog();

        animal.add(tiger);
        animal.add(panda);
        animal.add(dog);

        for (Animal s : animal){
            System.out.println(s.pet());
        }
    }
}
