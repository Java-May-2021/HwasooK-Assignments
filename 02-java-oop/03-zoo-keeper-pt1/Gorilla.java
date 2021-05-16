public class Gorilla {
    //wk2 day2
    private String name;
    private int strength;
    private int health;
    private char gender;

    //constructor
    public Gorilla(String name, int strength, char gender) {
        this.name = name;
        this.strength = strength;
        this.gender = gender;
        this.health = 100;
    }
    //getter and setter
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getStrength(){
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    //method inteeacting with another object
    public void battle(Gorilla people, String action) {
        //define logic of how gorilla attacks
        int damage;
        if(action.equals("throw")){
            damage = 5;
        } else if(action.equals("eatBanana")) {
            damage = -10;
        } else if(action.equals("climb")) {
            damage = 10;
        } else {
            System.out.println("Move not Recognized");
            return;
        }

        //Multiple Strength x Damage
        int effectiveDamage = this.strength * damage;

        //reduce our target animals health by effectiveDamage
        int gorillaHealth = people.getHealth();
        gorillaHealth -= effectiveDamage;
        people.setHealth(gorillaHealth);

        //prnt to the console what just happened, using a formatted string
        System.out.printf("%s throws %s for %d health points \n", this.name, people.name, effectiveDamage);
        System.out.println(people.name + " health is now " + people.health);
    }


}
