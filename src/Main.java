import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Plant> plants = new ArrayList<>();
        Plant laura = new Palms("Laura", 500);
        Plant olof = new Palms("Olof", 100);
        Plant igge = new Cactus("Igge", 20);
        Plant meatloaf = new CarnivorousPlants("Meatloaf", 70);

        System.out.print("Ange växtens namn: ");
        while (true) {
            try {
                String response = scanner.nextLine();
                if (response.trim().equalsIgnoreCase(String.valueOf(PlantNames.LAURA))) {
                    System.out.println("\n" + laura + laura.getLiquidType() + " dagligen.");
                    break;
                } else if (response.trim().equalsIgnoreCase(String.valueOf(PlantNames.OLOF))) {
                    System.out.println("\n" + olof + olof.getLiquidType() + " dagligen.");
                    break;
                } else if (response.trim().equalsIgnoreCase(String.valueOf(PlantNames.IGGE))) {
                    System.out.println("\n" + igge + igge.getLiquidType() + " dagligen.");
                    break;
                } else if (response.trim().equalsIgnoreCase(String.valueOf(PlantNames.MEATLOAF))) {
                    System.out.println("\n" + meatloaf + meatloaf.getLiquidType() + " dagligen.");
                    break;
                } else {
                    System.out.println("\nDet finns ingen växt med det namnet, försök igen.");
                }
            } catch (NoSuchElementException e){
                System.out.println("Closing.");
                break;
            }
        }
        scanner.close();


    }


}