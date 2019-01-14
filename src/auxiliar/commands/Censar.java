
package auxiliar.commands;

import constants.ExceptionsData;
import exceptions.ApplicationException;
import java.io.IOException;
import management.Manager;
import model.habitant.*;
import model.planet.Planet;
import persistence.Persistence;

public class Censar extends Command {
    
    public Censar(int arguments, String callCode) {
        super(arguments, callCode);
    }

    @Override
    public void call(String[] args) throws ApplicationException, IOException {
        String race = args[0];
        String planet = args[1];
        String name = args[2];
        Habitant habitant = new Human();
        Planet p = Manager.getPlanetByName(planet);
        
        switch (race.toUpperCase()) {

            case "ANDORIANO":
                boolean aenar;
                switch (args[3].toUpperCase()) {
                    case "AENAR":
                        aenar = true;
                        break;
                    case "NOAENAR":
                        aenar = false;
                        break;
                    default:
                        throw new ApplicationException(ExceptionsData.Errors.INVALID_ATTRIBUTE);
                }
                habitant = new Andorrano(name, aenar);
                break;

            case "HUMAN":
                int age = Integer.parseInt(args[3]);
                habitant = new Human(name, age);
                break;

            case "KLINGON":
                int strength = Integer.parseInt(args[3]);
                habitant = new Klingon(name, strength);
                break;

            case "NIBIRIAN":
                boolean vegetarian;
                switch (args[3].toUpperCase()) {
                    case "VEGETARIAN":
                        vegetarian = true;
                        break;
                    case "NOVEGETARIAN":
                        vegetarian = false;
                        break;
                    default:
                        throw new ApplicationException(ExceptionsData.Errors.INVALID_ATTRIBUTE);
                }
                habitant = new Nibirian(name, vegetarian);
                break;

            case "VULCAN":
                int meditation = Integer.parseInt(args[3]);
                habitant = new Vulcanian(name, meditation);
                break;

            default:
                throw new ApplicationException(ExceptionsData.Errors.INVALID_SPECIES);
        }
        
        // Save habitant in memory + persistence
        p.addHabitant(habitant);
        Persistence.addHabitantToPlanet(habitant, p);
    }
}