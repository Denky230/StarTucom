
package exceptions;

import constants.ExceptionsData.Errors;

public class InputException extends MyException {
    
    public InputException(Errors error) {
        super(error);
    }
}