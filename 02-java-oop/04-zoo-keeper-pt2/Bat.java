public class Bat extends Mammal2 {
    public Bat() {
        super(300);
    }
    public void fly() {
        System.out.println("Flying bat; -50 Energy");
        energyLevel -= 50;
    }
    public void eatHumans() {
        System.out.println("so- well, never mind; +25 Energy");
        energyLevel += 25;
    }
    public void attackTown() {
        System.out.println("sound of a town on fire; -100 Energy");
        energyLevel -= 100;
    }
}


