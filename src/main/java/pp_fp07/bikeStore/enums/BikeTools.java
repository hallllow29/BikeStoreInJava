/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp07.bikeStore.enums;

public enum BikeTools {
    BOOTLE_OF_WATER, REPAIR_KIT, TIRE, KILOMETER_COUNTER, SADDLEBAG, CELL_PHONE_HOLDER;
    
    public static String toolsToString(BikeTools tools) {
        switch(tools) {
            case BOOTLE_OF_WATER:
                return "Bootle of water";
            case REPAIR_KIT:
                return "Repair kit";
            case TIRE:
                return "Tire";
            case KILOMETER_COUNTER:
                return "Kilometer counter";
            case SADDLEBAG:
                return "Saddlebag";
            default:
                return "Cell phone holder";
        }
    }
}
