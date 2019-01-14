
package model.habitant;

public class Andorrano extends Habitant {
    
    private boolean isAenar;

    public Andorrano(String name, boolean isAenar) {
        super(name);
    }
    public Andorrano() {}

    public boolean isIsAenar() { return isAenar; }
    public void setIsAenar(boolean isAenar) { this.isAenar = isAenar; }

    @Override
    public String toString() {
        return getName() + ";isAenar=" + isAenar;
    }
}