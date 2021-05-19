import java.util.ArrayList;

public class ZooKeeper {
    public static void main(String[] args) {
        Gorilla magilla = new Gorilla();
        Mammal matthew = new Mammal("human", 100);
        Barrel b1 = new Barrel();

        magilla.attack(b1);
        ArrayList<Mammal> myMammals = new ArrayList<Mammal>();
        myMammals.add(matthew);
        myMammals.add(magilla);

        for (Mammal m : myMammals) {
            System.out.println(m.getSpecies());
        }
    }
}