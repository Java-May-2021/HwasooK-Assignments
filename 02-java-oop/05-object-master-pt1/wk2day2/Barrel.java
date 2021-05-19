public class Barrel implements Attackable {
    public class Barrel{
        private int health;

        public Barrel() {
            this.health = 20;
        }

        public int getHealth() {
            return this.health;
        }

        public void takeDamage(int damageAmount) {
            this.health -= damageAmount;
        }

        public void setHealth(int health) {
            this.health = health;
        }
    }
}
