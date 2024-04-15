package pt.ipp.estg.pp.pp_fp07.bikeStore;

import pp_fp07.bikeStore.enums.Brake;
import pp_fp07.bikeStore.enums.Material;
import pp_fp07.bikeStore.enums.Suspension;
import pp_fp07.bikeStore.enums.BikeTools;

public class BikeDemo {

    public static void main(String[] args) {
        BicycleManagement store = new BicycleManagement();
        
        BikeTools[] initialTools = {BikeTools.BOOTLE_OF_WATER, BikeTools.CELL_PHONE_HOLDER};
        MountainBike orbea = new MountainBike(5, "Black", 29, Brake.CALIPER, Material.ALUMINUM, 150, 10, 2, Suspension.DOUBLE, initialTools);
        MountainBike cannodale = new MountainBike (9, "Azul", 29, Brake.HYDRAULIC, Material.CARBON, 299, 10, 2, Suspension.SIMPLE, initialTools);

        orbea.displayBikeInformation();
        System.out.println();

        RoadBike canyon = new RoadBike(7, "Branco", 28, Brake.CALIPER, Material.ALUMINUM, 250, 15, "Castanho", 45, "Bike para competição ");

        canyon.displayBikeInformation();
        
        store.addBike(orbea);
        store.addBike(canyon);
        store.addBike(cannodale);
        
        store.removeBike(orbea);
        
        System.out.println();
        store.listBikes();
        
        System.out.println();
        store.listMountainBikes();
        
        System.out.println();
        store.listRoadBikes();
 
    }

}
