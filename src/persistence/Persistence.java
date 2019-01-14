
package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import management.Manager;
import model.habitant.Habitant;
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
    
    public static void addHabitantToPlanet(Habitant habitant, Planet planet) throws IOException {
        File f = new File(PERSISTENCE + planet.getName() + ".txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
        
        bw.write(habitant.toString());
        bw.newLine();
        bw.close();
    }
    
    public static List<String> getHabitantsFromPlanet(Planet planet) throws IOException {
        File f = new File(PERSISTENCE + planet.getName() + ".txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        List<String> habitants = new ArrayList<>();
        
        String line;
        while ((line = br.readLine()) != null) {
            line = line.replace(",", " ");
            habitants.add(line);
        }
        
        return habitants;
    }
}