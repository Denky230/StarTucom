
package model.habitant;

public class Vulcanian extends Habitant {
    
    private int meditation;

    public Vulcanian(String name, int meditation) {
        super(name);
        this.meditation = meditation;
    }

    public int getMeditation() { return meditation; }
    public void setMeditation(int meditation) { this.meditation = meditation; }
}