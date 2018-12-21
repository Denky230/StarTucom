
package startucom;

import management.Manager;

public class StarTucom {

    public static void main(String[] args) {
        try {
            Manager.initApp();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}