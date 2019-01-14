
package auxiliar.commands;

import exceptions.ApplicationException;
import java.io.IOException;

public abstract class Command {
 
    private final int ARGUMENTS;
    private final String CALL_CODE;

    public Command(int arguments, String callCode) {
        this.ARGUMENTS = arguments;
        this.CALL_CODE = callCode;
    }

    public int getArguments() { return ARGUMENTS; }
    public String getCallCode() { return this.CALL_CODE; }
    
    public void call(String args[]) throws ApplicationException, IOException {}
}