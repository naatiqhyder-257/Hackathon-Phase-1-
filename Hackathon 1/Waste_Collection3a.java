import java.util.*;
public class Waste_Collection3a{
    public static void main(String[] args){
Scanner sc =  new Scanner(System.in);


System.out.println("Enter the vehicle number: ");
int vehicleNumber = sc.nextInt();


System.out.println("Enter the waste collected in Kg: ");
double wasteCollected = sc.nextDouble();


System.out.println("Enter the Collection Point: ");
int collectionPoint = sc.nextInt();


System.out.println("Enter the waste type: ");
char wasteType = sc.next().charAt(0); ; // N for Non-Toxic, T for Toxic, R for Recyclable, H for Hazardous


System.out.println("The Vehicle Number is: " + vehicleNumber);
System.out.println("The Waste Collected (in kg): " + wasteCollected + " Kg");   
System.out.println("Collection Point: " + collectionPoint);
System.out.println("Waste Type: " + wasteType);

    }
}
