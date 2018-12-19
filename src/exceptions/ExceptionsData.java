
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
    
    public static final List<String> errorMessages = Arrays.asList(
        
        /* --- INPUT --- */
        
        "Nº de argumentos inválido",
        "Operación incorrecta",
        
        /* --- APPLICATION --- */
                
        "Especie incorrecta",
        "Planeta incorrecto",
        "Dato incorrecto",
        "No se puede registrar ese ser en ese planeta",
        "Ya existe un ser censado con ese nombre",
        "No existe ningún ser con ese nombre",
        "El ser no permite ser modificado",
        "Edad incorrecta",
        "Nivel de meditación incorrecto",
        "Valor de fuerza incorrecto"
    );
}