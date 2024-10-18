import javax.xml.crypto.Data;
import java.util.Date;

public abstract class Motorcycle implements Vehicle {
    private String licensePlate;
    private String vehicleType;
    private double rentalPrice;
    public Motorcycle(String licensePlate, String vehicleType, double rentalPrice){
        this.licensePlate = licensePlate;
        this.vehicleType = "Motorcycle";
        this.rentalPrice =rentalPrice;
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
    public void printVehicleDetails() {

    }

    @Override
    public void printRentedBy() {
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", rentalPrice=" + rentalPrice +
                '}';
    }
}
class SportBike extends Motorcycle{
        String color;
        int year ;

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
}