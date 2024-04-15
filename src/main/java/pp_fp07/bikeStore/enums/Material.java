
package pp_fp07.bikeStore.enums;

public enum Material {
    CARBON, ALUMINUM;
    
    public static String materialToString(Material material) {
        switch(material) {
            case CARBON:
                return "Carbon";
            default :
                return "Aluminum";
        }
    }
}
