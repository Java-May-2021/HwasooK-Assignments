public class Mammal2 {
    protected int energyLevel = 100;

    public Mammal2(){
        this.energyLevel = 100;
    }

    public Mammal2(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println("Energy Level: " + energyLevel);
        return energyLevel;
    }
}