import java.util.*;
public class Distance{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();
        
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        
        System.out.print("Enter the total time taken in hours: ");
        double timeTaken = scanner.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        double speed = totalDistance / timeTaken;

        System.out.println("Traveler Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time Taken: " + timeTaken + " hours");
	}
}