
package auxiliar.commands;

import exceptions.ApplicationException;
import java.io.IOException;

public class Borrar extends Command {
    
    public Borrar(int arguments, String callCode) {
        super(arguments, callCode);
    }

    @Override
    public void call(String[] args) throws ApplicationException, IOException {
        String name = args[0];
    }
}