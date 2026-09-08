package newSteveCode;

public class Material {
    private String name;
    private int maxDurability;
    private int mining_speed;
    private int damage;

    public Material(String name,int maxDurability, int mining_speed, int damage) {
        this.name = name;
        this.maxDurability = maxDurability;
        this.mining_speed = mining_speed;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public void setMaxDurability(int maxDurability) {
        this.maxDurability = maxDurability;
    }

    public int getMining_speed() {
        return mining_speed;
    }

    public void setMining_speed(int mining_speed) {
        this.mining_speed = mining_speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

