
package exceptions;

import constants.ExceptionsData.Errors;

public class ApplicationException extends MyException {
    
    public ApplicationException(Errors error) {
        super(error);
    }
}