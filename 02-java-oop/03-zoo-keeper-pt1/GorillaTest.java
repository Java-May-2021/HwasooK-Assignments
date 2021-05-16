public class GorillaTest {
    public static void main(String[] args) { //entry point method
        Gorilla gorilla = new Gorilla("Gorilla", 1, 'M');
        Gorilla hwasoo = new Gorilla("Hwasoo", 1, 'M');

        gorilla.battle(hwasoo, "throw");
        gorilla.battle(hwasoo, "throw");
        gorilla.battle(hwasoo, "throw");
        gorilla.battle(hwasoo, "eatBanana");
        gorilla.battle(hwasoo, "eatBanana");
        gorilla.battle(hwasoo, "climb");
    }
}
