import java.util.Scanner;

public class Waste_Collection3c{
    public static double Total_Waste(double collection_point1, double collection_point2) {
        return collection_point1 + collection_point2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter waste collected at Collection Point 1 in Kg: ");
        double collection_point1 = sc.nextDouble();

        System.out.print("Enter waste collected at Collection Point 2 in Kg: ");
        double collection_point2 = sc.nextDouble();

       
        double totalWaste = Total_Waste(collection_point1, collection_point2);
        System.out.println("Total waste collected: " + totalWaste + " Kg");
    }
}
