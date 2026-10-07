import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Växterna läggs till
        Palms laura = new Palms("Laura", 500);
        Palms olof = new Palms("Olof", 100);
        Cactus igge = new Cactus("Igge", 20);
        CarnivorousPlants meatloaf = new CarnivorousPlants("Meatloaf", 70);

        //Välj växt
        //Inga hårdkodade strängar eller siffror får förekomma i koden
        while (true) {
            String response = scanner.nextLine();
            if (response.trim().equalsIgnoreCase("laura")) {
                System.out.println("\n" + laura.getName() + " ska vattnas med " + laura.getLiquidAmount() + " " + laura.getliquidType() + " dagligen.");
                break;
            } else if (response.trim().equalsIgnoreCase("olof")) {
                System.out.println("\n" + olof.getName() + " ska vattnas med " + olof.getLiquidAmount() + " " + olof.getliquidType() + " dagligen.");
                break;
            } else if (response.trim().equalsIgnoreCase("igge")) {
                System.out.println("\n" + igge.getName() + " ska vattnas med " + igge.getLiquidAmount() + " " + igge.getliquidType() + " dagligen.");
                break;
            } else if (response.trim().equalsIgnoreCase("meatloaf")) {
                System.out.println("\n" + meatloaf.getName() + " ska vattnas med " + meatloaf.getLiquidAmount() + " " + meatloaf.getliquidType() + " dagligen.");
                break;
            } else {
                System.out.println("\nDet finns ingen växt med det namnet, försök igen.");
            }
        }


    }


}