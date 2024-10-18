public class Customer {
    String name;
    int age;
    String customerId;
    public Customer(String name, int age, String customerId){
        this.name = name;
        this.age = age;
        this.customerId =customerId;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
