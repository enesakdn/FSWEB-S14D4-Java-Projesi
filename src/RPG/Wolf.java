package RPG;

public class Wolf extends Monster implements Bleedable{
    public Wolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()*0.25;
    }


}