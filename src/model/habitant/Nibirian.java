
package model.habitant;

public class Nibirian extends Habitant {
    
    private boolean isCarnivore;
    
    public Nibirian(String name, boolean isCarnivore) {
        super(name);
    }

    public boolean isIsCarnivore() { return isCarnivore; }
    public void setIsCarnivore(boolean isCarnivore) { this.isCarnivore = isCarnivore; }
}