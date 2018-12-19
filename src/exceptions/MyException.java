
package exceptions;

import exceptions.ExceptionsData.Errors;

public class MyException extends Exception {
    
    protected Errors error;
    
    public MyException(Errors error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        // Get message corresponding to error
        String errorMessage = ExceptionsData.errorMessages.get(error.ordinal());
        // Force errorCode to have 3 digits by adding 0s
        String errorCode = String.format("%03d", error.ordinal() + 1);
        
        return "< ERROR "+errorCode+": "+errorMessage+" >";
    }
}