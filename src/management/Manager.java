
package management;

import auxiliar.AuxManager;
import constants.ExceptionsData;
import exceptions.ApplicationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.habitant.*;
import model.planet.Planet;
import model.planet.PlanetNano;
import persistence.Persistence;

public class Manager {
    
    private static List<Planet> planets;
    
    public static void initApp() throws IOException {
        initPlanets();
        Persistence.initPersistence();
        
        // Initialize auxiliar elements
        AuxManager.initCommands();
    }
    private static void initPlanets() {
        planets = new ArrayList<>();
        
        // VULCANO
        ArrayList<Habitant> vulcano_bannedRaces = new ArrayList<>();
        vulcano_bannedRaces.add(new Andorrano());
        vulcano_bannedRaces.add(new Klingon());
        vulcano_bannedRaces.add(new Nibirian());
        planets.add(new Planet("Vulcano", vulcano_bannedRaces));
        
        // ANDORRA
        ArrayList<Habitant> andorra_bannedRaces = new ArrayList<>();
        andorra_bannedRaces.add(new Vulcanian());
        andorra_bannedRaces.add(new Nibirian());
        planets.add(new Planet("Andorra", andorra_bannedRaces));
        
        // NIBIRU
        ArrayList<Habitant> nibiru_bannedRaces = new ArrayList<>();
        nibiru_bannedRaces.add(new Andorrano());
        nibiru_bannedRaces.add(new Klingon());
        nibiru_bannedRaces.add(new Nibirian());
        planets.add(new Planet("Nibiru", nibiru_bannedRaces));
        
        // KRONOS
        ArrayList<Habitant> kronos_bannedRaces = new ArrayList<>();
        kronos_bannedRaces.add(new Nibirian());
        planets.add(new PlanetNano("Kronos", kronos_bannedRaces, 30));
    }
    
    public static Planet getPlanetByName(String planetName) throws ApplicationException {
        for (Planet planet : planets) {
            if (planet.getName().equalsIgnoreCase(planetName))
                return planet;
        }
        throw new ApplicationException(ExceptionsData.Errors.INVALID_PLANET);
    }
    
    
    public static List<Planet> getPlanets() { return planets; }
}