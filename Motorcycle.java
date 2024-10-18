import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

public abstract class Motorcycle implements Vehicle {
    public ArrayList<Customer> customerList;
    private String licensePlate;
    private String vehicleType;
    private double rentalPrice;

    public Motorcycle(String licensePlate, String vehicleType, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.vehicleType = "Motorcycle";
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
    public void printVehicleDetails() {
        System.out.println("License Plate: " + licensePlate + " Type: " + vehicleType + "Price: " + rentalPrice);
    }

    @Override
    public void printRentedBy() {
        System.out.println("List of Customer");
        for (Customer customerList : customerList) {
            System.out.println(customerList);
        }

    }
}
     class SportBike extends Motorcycle {
        String color;
        int year;

        public SportBike(String licensePlate, String vehicleType, double rentalPrice, String color, int year) {
            super(licensePlate, vehicleType, rentalPrice);
            this.color = color;
            this.year = year;

        }

        @Override
        public String getLicensePlate() {
            return super.getLicensePlate();
        }

        @Override
        public String getVehicleType() {
            return super.getVehicleType();
        }

        @Override
        public double getRentalPricePerDay() {
            return super.getRentalPricePerDay();
        }

        @Override
        public void printVehicleDetails() {
            super.printVehicleDetails();
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
