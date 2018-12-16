
package exceptions;

import exceptions.ExceptionsData.Errors;

public class ApplicationException extends MyException {
    
    public ApplicationException(Errors error) {
        super(error);
    }
}