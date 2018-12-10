
package persistence;

import java.io.File;

public class Persistence {

    private final String SEPARATOR = File.separator;
    private final String ROOT_PATH = System.getProperty("user.dir");

    private final String PERSISTENCE = ROOT_PATH + SEPARATOR + "persistence" + SEPARATOR;
}