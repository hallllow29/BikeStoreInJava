package pt.ipp.estg.pp.pp_fp07.bikeStore;
import pp_fp07.bikeStore.enums.Brake;
import pp_fp07.bikeStore.enums.Material;

public class RoadBike extends Bicycle {
    
    private static final String ROADBIKE_CODE = "R";
    
    private String handlebelt;
    private int frameSize;
    private String observations;

    public RoadBike (int numberOfGears, String mainColor , int wheelSize, Brake brakes , Material material , float price, int guarantee, String handlebelt , int frameSize, String observations) {
        super(numberOfGears, mainColor, wheelSize, brakes.HYDRAULIC, material.CARBON, price, guarantee);
        setCode();
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        setObservations(observations);
    }
    
     private void setCode() {
        String roadBikeCode = ROADBIKE_CODE + getNextId();
        super.setCode(roadBikeCode);
    }

    
    public void setObservations(String observations) {
        if (observations.length() < 50) {
            this.observations = observations;
        } else {
            System.out.println("There is a 50 character limit!");
        }
    }
    
    public void displayBikeInformation() {
        System.out.println("Road bike details");
        System.out.println("ID: " + getCode());
        System.out.println("Number of gears: " + getNumberOfGears());
        System.out.println("Color: " + getMainColor());
        System.out.println("Wheel Size: " + getWheelSize());
        System.out.println("Type of brakes: " + Brake.brakeToString(getBrakes()));
        System.out.println("Type of material: " + Material.materialToString(getMaterial()));
        System.out.println("Price: " + getPrice() + "€");
        System.out.println("Guarantee in years: " + getGuarantee());
        System.out.println("Handlebelt: " + handlebelt);
        System.out.println("Frame size: " +frameSize);
        System.out.println("Observations: " + observations);
    }
    
    public String roadBikeToString() {
        return "Road Bike ID -> " + getCode();
    }
}
