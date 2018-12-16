
package exceptions;

import java.util.Arrays;
import java.util.List;

public class ExceptionsData {
    
    public static enum Errors {
        
        /* --- INPUT --- */
        
        INVALID_NUM_ARGUMENTS,
        COMMAND_NOT_FOUND,
                
        /* --- APPLICATION --- */
        
        INVALID_SPECIES,
        INVALID_PLANET,
        INVALID_ATTRIBUTE,
        BANNED_SPECIES,
        DUPLICATE_NAME,
        NAME_NOT_FOUND,
        IMMUTABLE_SPECIES,
        INVALID_AGE,
        INVALID_MEDITATION,
        INVALID_STRENGTH
    }
    
    private static final List<String> errorMessages = Arrays.asList(
        
        /* --- INPUT --- */
        
        
        
        /* --- APPLICATION --- */
    );
}