/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp07.bikeStore.enums;

public enum Suspension {
    SIMPLE, DOUBLE, NONE;
    
    public static String suspensionToString(Suspension suspension) {
        switch(suspension) {
            case SIMPLE:
                return "Simple suspension";
            case DOUBLE:
                return "Double suspension";
            default :
                return "No suspension";
        }
    }
}
