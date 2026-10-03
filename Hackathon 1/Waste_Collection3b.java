import java.util.*;
public class Waste_Collection3b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of waste collected in Kg: ");
        int waste_collected = sc.nextInt();
        System.out.println("Amount of waste collected: " + waste_collected + " Kg");
        if(waste_collected >= 100){
            System.out.println("Collection Target Achieved.");
        }
        else{
            System.out.println("More Waste Collection Required.");
        }
    }
}