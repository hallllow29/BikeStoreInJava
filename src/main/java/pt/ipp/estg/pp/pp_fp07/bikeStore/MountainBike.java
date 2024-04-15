/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp07.bikeStore;

import pp_fp07.bikeStore.enums.Suspension;
import pp_fp07.bikeStore.enums.Brake;
import pp_fp07.bikeStore.enums.Material;
import pp_fp07.bikeStore.enums.BikeTools;

public class MountainBike extends Bicycle {

    private static final int MAX_TOOLS = 5;
    private static final String MOUNTAIN_CODE = "M";

    private int numberOfLigths;
    private Suspension suspension;
    private BikeTools[] bikeTools = new BikeTools[MAX_TOOLS];
    private int numberOfTools = 0;

    public MountainBike(int numberOfGears, String mainColor, int wheelSize, Brake brakes, Material material, float price, int guarantee, int numberOfLigths, Suspension suspension, BikeTools[] bikeTools) {
        super(numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        setCode();
        this.numberOfLigths = numberOfLigths;
        this.suspension = suspension;
        setBikeTools(bikeTools);
    }

    public void setBikeTools(BikeTools[] bikeTools) {
        for (int i = 0; i < bikeTools.length && numberOfTools < MAX_TOOLS; i++) {
            if (numberOfTools < MAX_TOOLS) {
                this.bikeTools[numberOfTools] = bikeTools[i];
                numberOfTools++;
            }
        }
    }

    private void setCode() {
        String mountainCode = MOUNTAIN_CODE + getNextId();
        super.setCode(mountainCode);
    }

    public void displayBikeInformation() {
        System.out.println("Mountain bike details");
        System.out.println("ID: " + getCode());
        System.out.println("Number of gears: " + getNumberOfGears());
        System.out.println("Color: " + getMainColor());
        System.out.println("Wheel Size: " + getWheelSize());
        System.out.println("Type of brakes: " + Brake.brakeToString(getBrakes()));
        System.out.println("Type of material: " + Material.materialToString(getMaterial()));
        System.out.println("Price: " + getPrice() + "€");
        System.out.println("Guarantee in years: " + getGuarantee());
        System.out.println("Number of ligths: " + numberOfLigths);
        System.out.println("Suspension type: " + Suspension.suspensionToString(suspension));

        if (bikeTools != null) {
            for (BikeTools tool : bikeTools) {
                if (tool != null) {
                    System.out.println("-" + BikeTools.toolsToString(tool));
                }
            }
        } else {
            System.out.println("No tools availabe!");
        }

    }

    public String mountainBikeToString() {
        return "Mountain Bike ID -> " + getCode();
    }

}
