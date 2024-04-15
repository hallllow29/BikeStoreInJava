/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.ipp.estg.pp.pp_fp07.bikeStore;

import java.util.Arrays;

public class BicycleManagement {

    private static final int MAX_BIKES = 20;
    private static final int ARRAY_EXPAND = 2;

    private Bicycle[] bicycles;
    private int numberOfBikes = 0;

    public BicycleManagement() {
        bicycles = new Bicycle[MAX_BIKES];
    }

    public void addBike(Bicycle bike) {
        increaseCapacity();
        bicycles[numberOfBikes] = bike;
        numberOfBikes++;
        System.out.println("Bike added with success");

    }

    public void removeBike(Bicycle bike) {
        for (int i = 0; i < numberOfBikes; i++) {
            if (bike == bicycles[i]) {
                for (int j = i; j < numberOfBikes - 1; j++) {
                    bicycles[j] = bicycles[j + 1];
                }
                bicycles[numberOfBikes - 1] = null;
                numberOfBikes--;
                System.out.println("Bike removed");
            }
        }
    }

    private String bikeInfo(Bicycle bike) {
        if (bike instanceof MountainBike) {
            MountainBike mountainBike = (MountainBike) bike;
            return mountainBike.mountainBikeToString();
        } else if (bike instanceof RoadBike) {
            RoadBike roadBike = (RoadBike) bike;
            return roadBike.roadBikeToString();

        } else {
            return "Bike not found!";
        }
    }

    public void listBikes() {
        int bikeNumber = 1;

        System.out.println("List of bikes");
        for (Bicycle bicycle : bicycles) {
            if (bicycle != null) {
                System.out.println(bikeNumber + ". " + bikeInfo(bicycle));
                bikeNumber++;
            }

        }
    }

    public void listMountainBikes() {
        int mountainBikeNumber = 1;

        System.out.println("List of mountain bikes available");
        for (Bicycle bicycle : bicycles) {
            if (bicycle instanceof MountainBike) {
                System.out.println(mountainBikeNumber + "- " + bikeInfo(bicycle));
            }
        }
    }

    public void listRoadBikes() {
        int roadBikeNumber = 1;

        System.out.println("List of road bikes available");
        for (Bicycle bicycle : bicycles) {
            if (bicycle instanceof RoadBike) {
                System.out.println(roadBikeNumber + "- " + bikeInfo(bicycle));
            }
        }
    }

    private void increaseCapacity() {
        if (numberOfBikes == bicycles.length) {
            int newCapacity = bicycles.length * ARRAY_EXPAND;
            bicycles = Arrays.copyOf(bicycles, newCapacity);
        }
    }
}
