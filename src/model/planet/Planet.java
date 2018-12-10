
package model.planet;

import model.habitant.Habitant;
import java.util.ArrayList;

public class Planet {

    private final ArrayList<Habitant> population;
    private final ArrayList<Class> bannedRaces;

    public Planet(ArrayList<Habitant> population, ArrayList<Class> bannedRaces) {
        this.population = population;
        this.bannedRaces = bannedRaces;
    }

    public ArrayList<Habitant> getHabitants() { return population; }

    public ArrayList<Class> getBannedRaces() { return bannedRaces; }
}