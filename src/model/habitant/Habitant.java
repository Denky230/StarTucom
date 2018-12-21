
package model.habitant;

public abstract class Habitant {

    private String name;

    public Habitant(String name) {
        this.name = name;
    }
    public Habitant() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}