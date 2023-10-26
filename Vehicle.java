public abstract class Vehicle{
    String vehicleBrand;
    String vehicleColor;
    int passengers;
    int weight;
    public class Car extends Vehicle{
        int numberofSeats;
        int trunkSize;
    }
    public final class Truck extends Vehicle{
        int bedSize;
        
    } 
}