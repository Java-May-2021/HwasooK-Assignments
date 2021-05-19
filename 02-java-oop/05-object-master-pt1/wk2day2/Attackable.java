public interface Attackable {
    // attackable things must have health
    int getHealth();
    void takeDamage(int damageAmount);
    void setHealth(int health);
}
