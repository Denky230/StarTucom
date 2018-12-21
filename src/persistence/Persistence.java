
package persistence;

import java.io.File;
import java.io.IOException;
import management.Manager;
import model.planet.Planet;

public class Persistence {

    private static final String SEPARATOR = File.separator;
    private static final String ROOT_PATH = System.getProperty("user.dir");
    private static final String PERSISTENCE = ROOT_PATH + SEPARATOR + "persistence" + SEPARATOR;
    
    public static void initPersistence() throws IOException {
        // Make persistence root directory if not found
        File root = new File(PERSISTENCE);
        if (!root.exists())
            root.mkdir();
        
        // Make a persistence file for each planet
        for (Planet planet : Manager.getPlanets()) {
            String planetPath = PERSISTENCE + planet.getName() + ".txt";
            File f = new File(planetPath);
            f.createNewFile();
        }
    }
}