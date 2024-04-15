package pt.ipp.estg.pp.pp_fp07.bikeStore;

import pp_fp07.bikeStore.enums.Material;
import pp_fp07.bikeStore.enums.Brake;

/**
 *
 * @author PAntunes
 */
public class Bicycle {

    private static int nextId = 0;

    private String code;
    private int numberOfGears;
    private String mainColor;
    private int wheelSize;
    private Brake brakes;
    private Material material;
    private float price;
    private int guarantee;

    public Bicycle(int numberOfGears, String mainColor, int wheelSize, Brake brakes, Material material, float price, int guarantee) {
        this.code = generateCode();
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guarantee = guarantee;
    }

    private String generateCode() {
        String generateCode = String.format("%02d", nextId);
        nextId++;
      
        return generateCode;
    }
    
    public void setCode(String newValue) {
        this.code = newValue;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }
    
    public int getNextId() {
        return nextId;
    }

    public String getMainColor() {
        return mainColor;
    }
    
    public int getWheelSize() {
        return wheelSize;
    }
    
    public Brake getBrakes() {
        return brakes;
    }
    
    public Material getMaterial() {
        return material;
    }
    
    public float getPrice() {
        return price;
    }
    
    public int getGuarantee() {
        return guarantee;
    }
    
    public String getCode() {
        return code;
    }
}
 