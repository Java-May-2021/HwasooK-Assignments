public class Gorilla extends Mammal{
    // Directly calling the mammal constructor
    //wk2day2 note 30:
    public Gorilla(){ 
        super("gorilla", 500);
    }

    public void eatBanana() {
        System.out.println("I am a %s eating a banana", this.species);
    }
    @Override
    public void takeDamage(int damageAmount) {
        this.health -= (damageAmount / 2);
    }
}
