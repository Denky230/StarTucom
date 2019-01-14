
package auxiliar;

import auxiliar.commands.Borrar;
import auxiliar.commands.Censar;
import auxiliar.commands.Command;
import auxiliar.commands.Listado;
import constants.ExceptionsData;
import exceptions.ApplicationException;
import exceptions.InputException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuxManager {
    
    private static List<Command> commands;
    
    public static void initCommands() {
        commands = new ArrayList<>();
        
        commands.add(new Censar(4, "C"));
        commands.add(new Borrar(1, "B"));
        commands.add(new Listado(0, "L"));
    }
    
    public static void validateCommand(String callCode, String[] args) throws InputException, ApplicationException, IOException {
        // Make sure given command exists
        Command c = getCommandByCallCode(callCode);
        // Make sure number of arguments is correct for given command
        if (c.getArguments() != args.length)
            throw new ApplicationException(ExceptionsData.Errors.INVALID_NUM_ARGUMENTS);
        
        // Call command with given arguments
        c.call(args);
    }
    private static Command getCommandByCallCode(String callCode) throws InputException {
        for (Command command : commands) {
            if (command.getCallCode().equalsIgnoreCase(callCode))
                return command;
        }
        throw new InputException(ExceptionsData.Errors.COMMAND_NOT_FOUND);
    }
}