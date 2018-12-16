
package model.planet;

import java.util.ArrayList;

public class PlanetNano extends Planet {

    private int maxPopulation;

    public PlanetNano(String name, ArrayList<Class> bannedRaces, int maxPopulation) {
        super(name, bannedRaces);
        this.maxPopulation = maxPopulation;
    }

    public int getMaxPopulation() { return maxPopulation; }
    public void setMaxPopulation(int maxPopulation) { this.maxPopulation = maxPopulation; }
}