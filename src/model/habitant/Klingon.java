
package model.habitant;

public class Klingon extends Habitant {

    private int strength;

    public Klingon(String name) {
        super(name);
    }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }
}