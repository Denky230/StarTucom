
package model.planet;

import exceptions.ApplicationException;
import constants.ExceptionsData.Errors;
import model.habitant.Habitant;
import java.util.ArrayList;

public class Planet {

    private final String name;
    private final ArrayList<Habitant> habitants;
    private final ArrayList<Habitant> bannedRaces;

    public Planet(String name, ArrayList<Habitant> bannedRaces) {
        this.habitants = new ArrayList<>();
        this.bannedRaces = bannedRaces;
        this.name = name;
    }

    public String getName() { return name; }
    public ArrayList<Habitant> getHabitants() { return habitants; }
    public ArrayList<Habitant> getBannedRaces() { return bannedRaces; }
    
    protected boolean isRaceBanned(Habitant habitant) {
        for (Habitant bannedRace : bannedRaces) {
            if (habitant.getClass().equals(bannedRace.getClass()))
                return true;
        }
        return false;
    }
    
    public void addHabitant(Habitant habitant) throws ApplicationException {
        if (isRaceBanned(habitant))
            throw new ApplicationException(Errors.BANNED_SPECIES);
        
        habitants.add(habitant);
    }
}