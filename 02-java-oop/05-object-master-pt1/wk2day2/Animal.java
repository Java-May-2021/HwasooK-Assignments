public class Animal {
    //wk2day2 note
    private String name;
    private int strength;
    private int health;
    private String size;

    // constuctor
    public Animal(String name, int strength, int health, String size) {
    this.name = name;
    this.strength = strength;
    this.health = health;
    this.size = size;
    }

    public Animal(String name, int strength, String size) {
    this.name = name;
    this.strength = strength;
    this.health = 100;
    this.size = size;
    }

    public String getName() {
    return this.name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public int getStrength() {
    return this.strength;
    }

    public void setStrength(int strength) {
    this.strength = strength;
    }

    public void setHealth(int health) {
    this.health = health;
    }

    public int getHealth() {
    return this.health;
    }

    public void setSize(String size) {
    this.size = size;
    }

    public String getSize() {
    return this.size;
    }

    // Attacks another animal object
    public void battle(Animal target, String powerMove) {
      // Define the logic of how an animal attacks
    int damage;
    if (powerMove.equals("body slam")) {
        damage = 3;
    } else if (powerMove.equals("fireball")) {
        damage = 4;
    } else if (powerMove.equals("roar")) {
        damage = 2;
    } else {
        System.out.println("Move not recognizeed");
        return;
    }

      // multiply strength x damage
      int effectiveDamage = this.strength * damage;

      // reduce target health by the effective damage
    int targetsHealth = target.getHealth();
    int healthAfterAttack = targetsHealth - effectiveDamage;
    target.setHealth(healthAfterAttack);

    System.out.printf("%s attacks %s for %d health points \n", this.name, target.getName(), effectiveDamage);
    }

    public void battle(Animal target) {
        this.battle(target, "body slam");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

}
