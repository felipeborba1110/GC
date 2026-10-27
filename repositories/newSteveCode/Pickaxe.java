package newSteveCode;

public class Pickaxe {
    private String name;
    private Material material;
    private int durability;
    private int mining_speed;
    private int damage;

    public Pickaxe(Material material, int durability, int mining_speed, int damage) {
        this.name = material.getName() + " Pickaxe";
        this.material = material;
        this.durability = durability;
        this.mining_speed = mining_speed;
        this.damage = damage;
    }

    public Pickaxe(Material material){
        this.name = material.getName() + " Pickaxe";
        this.material = material;
        this.durability = material.getMaxDurability();
        this.mining_speed = material.getMining_speed();
        this.damage = material.getDamage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
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

    public void mine(int blocks){
        if (durability <= 0) {
            System.out.println("Picareta quebrada!");
        } else {
            if (blocks > durability){
                int remaning = blocks - durability;
                durability = 0;
                System.out.printf("A Picareta quebrou e ainda faltam %d blocos a serem quebrados\n", remaning);
            } else {
                setDurability(durability - blocks);
                System.out.println("Blocos querbados com sucesso!");
                System.out.printf("Durabilidade restante: %d\nBlocos querbados: %d\n",durability,blocks);
            }

        }

    }

    public void repair(int quantity){
        if (durability + quantity >= material.getMaxDurability()){
            setDurability(material.getMaxDurability());
            System.out.println("Picareta reparada ao máximo com sucesso!");
        } else {
            setDurability(durability + quantity);
            System.out.println("Picareta reparada com sucesso!");
            System.out.printf("Durabilidade atual: " + durability + "\n" );
        }
    }

    @Override
    public String toString() {
        return String.format("Nome da Picareta: %s\nMaterial: %s\nDurabilidade: %d\nForça: %d",name,material.getName(),durability,mining_speed);
    }
}
