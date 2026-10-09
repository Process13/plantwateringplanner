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
        System.out.print("Ange växtens namn: ");
        while (true) {
            String response = scanner.nextLine();
            if (response.trim().equalsIgnoreCase("laura")) {
                System.out.println("\n" + laura + laura.getliquidType() + " dagligen.");
                break;
            } else if (response.trim().equalsIgnoreCase("olof")) {
                System.out.println("\n" + olof + olof.getliquidType() + " dagligen.");
                break;
            } else if (response.trim().equalsIgnoreCase("igge")) {
                System.out.println("\n" + igge + igge.getliquidType() + " dagligen.");
                break;
            } else if (response.trim().equalsIgnoreCase("meatloaf")) {
                System.out.println("\n" + meatloaf + meatloaf.getliquidType() + " dagligen.");
                break;
            } else {
                System.out.println("\nDet finns ingen växt med det namnet, försök igen.");
            }
        }
        scanner.close();


    }


}