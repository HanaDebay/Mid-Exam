import java.util.ArrayList;

public abstract class Car implements Vehicle {
    //license plate, vehicle type, and rental price
    public ArrayList<Customer> customerList;
    private String licensePlate;
    private String vehicleType;
    private double rentalPrice;

    public Car(String licensePlate, String vehicleType, double rentalPrice){
        this.licensePlate = licensePlate;
        this.vehicleType = "Car";
        this.rentalPrice = rentalPrice;
        this.customerList = new ArrayList<>();

    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public double getRentalPricePerDay() {
        return rentalPrice;
    }

    @Override
    public void printRentedBy() {
        System.out.println("List of Customer");
        for (Customer customerList : customerList) {
            System.out.println(customerList);
        }
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("License Plate: "+licensePlate +" Type: "+vehicleType +"Price: "+rentalPrice);
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

    @Override
    public void rentVehicle(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void returnVehicle(Customer customer) {
        customerList.remove(customer);
    }
}