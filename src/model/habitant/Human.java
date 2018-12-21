
package model.habitant;

public class Human extends Habitant {

    private int age;

    public Human(String name, int age) {
        super(name);
        this.age = age;
    }
    public Human() {}

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}