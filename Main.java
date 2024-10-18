import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       //Customer customers = new Customer("Sam",20,"S123");
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Prince",22,"P202"));
        customers.add(new Customer("David",23,"D102"));
        customers.add(new Customer("Matongo",24,"M302"));
        customers.add(new Customer("Jack",25,"J402"));
        customers.add(new Customer("Veronica",24,"V502"));
        customers.add(new Customer("Hana",25,"H602"));
        customers.add(new Customer("Debay",26,"D702"));
        customers.add(new Customer("Eva",27,"E802"));
        customers.add(new Customer("Bob",28,"B902"));
        customers.add(new Customer("Sara",24,"S306"));

        Sedan sedan1 =  new Sedan("SBD123","Copmact",2000,4, "Black");
        Sedan sedan2 =  new Sedan("ABD567","Copmact",2000,4, "White");

        SportBike sportBike1 = new SportBike("ASF906","Suzuki",20,"White",2024);
        SportBike sportBike2 = new SportBike("EXC842","Honda",20,"Red",2024);

        sedan1.rentVehicle(customers.get(0));
        sportBike1.rentVehicle(customers.get(1));
        sedan2.rentVehicle(customers.get(2));
        sportBike2.rentVehicle(customers.get(3));

        sedan1.printVehicleDetails();
        sedan1.printRentedBy();
        sedan2.printVehicleDetails();
        sedan2.printRentedBy();
        sportBike2.printVehicleDetails();
        sportBike2.printRentedBy();
        sportBike1.printVehicleDetails();
        sportBike1.printRentedBy();


    }
}