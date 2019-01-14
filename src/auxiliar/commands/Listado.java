
package auxiliar.commands;

import exceptions.ApplicationException;
import java.io.IOException;
import java.util.List;
import management.Manager;
import model.planet.Planet;
import persistence.Persistence;

public class Listado extends Command {
    
    public Listado(int arguments, String callCode) {
        super(arguments, callCode);
    }

    @Override
    public void call(String[] args) throws ApplicationException, IOException {
        List<Planet> planets = Manager.getPlanets();
        
        for (Planet planet : planets) {
            List<String> habitants = Persistence.getHabitantsFromPlanet(planet);
            
            for (String habitant : habitants) {
                System.out.println(habitant);
            }
        }
    }
}