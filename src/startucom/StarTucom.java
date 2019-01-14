
package startucom;

import auxiliar.AuxManager;
import exceptions.ApplicationException;
import exceptions.InputException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import management.Manager;

public class StarTucom {

    public static void main(String[] args) {
        try {
            Manager.initApp();
            
            // Read user input
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while (!(line = br.readLine()).equals("x")) {
                
                try {
                    processUserInput(line);
                    
                } catch (InputException | ApplicationException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("There was a problem when tyring to access application data - Error: " + e.getMessage());
        }
    }
    
    private static void processUserInput(String input) throws InputException, ApplicationException, IOException {
            String[] in = input.split(" ");

            // First input is the command call, rest is arguments
            String commandCode = in[0];
            String[] arguments = new String[in.length - 1];
            for (int i = 0; i < arguments.length; i++) {
                arguments[i] = in[i + 1];
            }
            
            // Validate user input as a command
            AuxManager.validateCommand(commandCode, arguments);
    }
}