public class Mammal implements Attackable {
    //wk2day2 note 30:
    protected String species;
    protected int health;

    public Mammal(String species, int health) {
        this.species = species;
        this.health = health;
    }

    public String getSpecies() {
        return species;
    }
    public void setString(String species) {
        this.species = species;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damageAmount) {
        this.health -= damageAmount;
    }

    //attack
    public void attack(Attackable target) {
        int health = target.getHealth();
        target.setHealth(health - 5);
    }
}
