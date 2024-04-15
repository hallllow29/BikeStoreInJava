/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp07.bikeStore.enums;

public enum Brake {
    CALIPER, HYDRAULIC;
    
    public static String brakeToString(Brake brake) {
        switch(brake) {
            case CALIPER:
                return "Caliper brakes";
            default:
                return "Hydraulic brakes";
        }
    }
}
