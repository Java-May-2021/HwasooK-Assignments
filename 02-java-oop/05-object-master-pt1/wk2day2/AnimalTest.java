public class AnimalTest {
    public static void main(String[] args) {
        Animal lion = new Animal("Zoltar", 6, "large");
        Animal zebra = new Animal("Maurice", 6, "large");
        Animal giraffe = new Animal("Jeffrey", 6, "large");

        lion.battle(zebra, "roar");
        System.out.println(zebra.getHealth());
        zebra.battle(lion, "fireball");
        System.out.println(lion.getHealth());
    }
}
