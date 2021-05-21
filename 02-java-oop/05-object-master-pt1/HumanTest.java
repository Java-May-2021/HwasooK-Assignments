public class HumanTest {
    public static void main(String[] args) {
        Human a = new Human();
        Human b = new Human();
        a.attack(b);
        System.out.println(b.health);

        Ninja n = new Ninja();
        //Wizard w = new Wizard();
        //Samurai s = new Samurai();

        n.steal(b);
        n.runAway();
        System.out.println(n.health);
        System.out.println(b.health);

    }
}
