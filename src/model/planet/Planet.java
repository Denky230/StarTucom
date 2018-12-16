
package model.planet;

import exceptions.ApplicationException;
import exceptions.ExceptionsData.Errors;
import model.habitant.Habitant;
import java.util.ArrayList;

public class Planet {

    private final ArrayList<Habitant> habitants;
    private final ArrayList<Class> bannedRaces;
    private String name;

    public Planet(String name, ArrayList<Class> bannedRaces) {
        this.habitants = new ArrayList<>();
        this.bannedRaces = bannedRaces;
        this.name = name;
    }

    public String getName() { return name; }
    public ArrayList<Habitant> getHabitants() { return habitants; }
    public ArrayList<Class> getBannedRaces() { return bannedRaces; }
    
    public void addHabitant(Habitant habitant) throws ApplicationException {
        for (Class bannedRace : bannedRaces) {
            if (habitant.getClass().equals(bannedRace))
                throw new ApplicationException(Errors.BANNED_SPECIES);
        }
    }
}