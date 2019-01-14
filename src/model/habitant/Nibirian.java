
package model.habitant;

public class Nibirian extends Habitant {
    
    private boolean isVegan;
    
    public Nibirian(String name, boolean isCarnivore) {
        super(name);
    }
    public Nibirian() {}

    public boolean isVegan() { return isVegan; }
    public void setVegan(boolean isVegan) { this.isVegan = isVegan; }

    @Override
    public String toString() {
        return getName() + "isVegan=" + isVegan;
    }
}