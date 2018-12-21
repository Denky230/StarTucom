
package model.planet;

import exceptions.ApplicationException;
import constants.ExceptionsData.Errors;
import java.util.ArrayList;
import model.habitant.Habitant;

public class PlanetNano extends Planet {

    private int maxPopulation;

    public PlanetNano(String name, ArrayList<Habitant> bannedRaces, int maxPopulation) {
        super(name, bannedRaces);
        this.maxPopulation = maxPopulation;
    }

    public int getMaxPopulation() { return maxPopulation; }
    public void setMaxPopulation(int maxPopulation) { this.maxPopulation = maxPopulation; }

    @Override
    public void addHabitant(Habitant habitant) throws ApplicationException {
        if (getHabitants().size() == maxPopulation)
            throw new ApplicationException(Errors.PLANET_FULL);
        
        super.addHabitant(habitant);
    }
}