public class HumanTest {
    public static void main(String[] args) {
        Human a = new Human();
        Human b = new Human();
        a.attack(b);
        System.out.println(b.health);
        //System.out.printf("%s attacked %s . Trmaining health is %d", a, b, b.health);

        Ninja n = new Ninja();
        Wizard w = new Wizard();
        Samurai s = new Samurai();

        a.attack(n);
        System.out.println(n.health);
        n.steal(b);
        System.out.println(n.health);
        n.runAway();
        System.out.println(b.health);
        
        w.heal(b);
        System.out.println(b.health);
        w.fireball(s);
        w.fireball(s);
        w.fireball(s);
        w.fireball(s);
        w.fireball(s);
        w.fireball(s);
        System.out.println(s.health);

        s.deathBlow(a);
        System.out.println(a.health);
        s.meditate();
        System.out.println(s.health);



    }
}
