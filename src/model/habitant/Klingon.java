
package model.habitant;

public class Klingon extends Habitant {

    private int strength;

    public Klingon(String name, int strength) {
        super(name);
        this.strength = strength;
    }
    public Klingon() {}

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    @Override
    public String toString() {
        return getName() + "strength=" + strength;
    }
}