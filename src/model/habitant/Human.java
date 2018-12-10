
package model.habitant;

public class Human extends Habitant {

    private int age;

    public Human(int age, String name) {
        super(name);
        this.age = age;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}