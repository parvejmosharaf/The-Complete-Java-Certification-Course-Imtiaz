package java_imtiaz.car_dealership;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Pax", "hangzhou 620", 12000);

        Vehicle vehicle = new Vehicle("BmW", "M3", 20000);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

        Vehicle car = new Vehicle("BmW", "M3", 20000);
        boolean value = car.equals(vehicle);
        System.out.println(value);

    }
}
