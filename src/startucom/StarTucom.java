
package startucom;

import exceptions.ApplicationException;
import java.util.ArrayList;
import model.habitant.Human;
import model.planet.Planet;

public class StarTucom {

    public static void main(String[] args) {
        try {
            ArrayList<Class> bannedRaces = new ArrayList<>();
            bannedRaces.add(Human.class);

            Planet p = new Planet("Pluton", bannedRaces);
            p.addHabitant(new Human("hi", 0));
            
        } catch (ApplicationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}