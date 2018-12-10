
package model.planet;

import java.util.ArrayList;
import model.habitant.Habitant;

public class PlanetNano extends Planet {

    private int maxPopulation;

    public PlanetNano(int maxPopulation, ArrayList<Habitant> population, ArrayList<Class> bannedRaces) {
        super(population, bannedRaces);
        this.maxPopulation = maxPopulation;
    }

    public int getMaxPopulation() { return maxPopulation; }
    public void setMaxPopulation(int maxPopulation) { this.maxPopulation = maxPopulation; }
}