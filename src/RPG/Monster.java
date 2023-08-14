package RPG;

public abstract  class Monster  {

    private String name;
    private int hitPoints;

    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }

     public double bleed() {
        if(this instanceof Bleedable) {
            return this.bleed();
        } else {
            return 0;
        }
    }
     public double poison(){
        if(this instanceof Poisonable) {
            return this.poison();
        } else {
            return 0;
        }
  }
    public double attack() {
        return getDamage() +bleed() + poison();
    }
}
