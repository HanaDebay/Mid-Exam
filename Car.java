import java.util.ArrayList;

public abstract class Car implements Vehicle {
    //license plate, vehicle type, and rental price
    public ArrayList<Customer> customer;
    private String licensePlate;
    private String vehicleType;
    private double rentalPrice;

    public Car(String licensePlate, String vehicleType, double rentalPrice){
        this.licensePlate = licensePlate;
        this.vehicleType = "Car";
        this.rentalPrice = rentalPrice;
        this.customer = new ArrayList<>();

    }
    public void displayCustomer(){
        System.out.println("List of Customer");
        for(Customer customerList : customer){
            System.out.println(customerList);
        }
    }

    @Override
    public String getLicensePlate() {
        return "";
    }

    @Override
    public String getVehicleType() {
        return "";
    }

    @Override
    public double getRentalPricePerDay() {
        return 0;
    }

    @Override
    public void printRentedBy() {

    }

    @Override
    public void printVehicleDetails() {

    }
}
class Sedan extends Car{
    private int numberOfDoors;
    private String color;

    public Sedan(String licensePlate, String vehicleType, double rentalPrice, int numberOfDoors, String color) {
        super(licensePlate, vehicleType, rentalPrice);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("Vehicle Type: "+getVehicleType() +
                "Licence Plate: "+getVehicleType() + "Rental Price: "+ getRentalPricePerDay() +"Number Of Doors "+ numberOfDoors + "Color "+ color);
    }
}