package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.setVehicles(new Vehicle[4]);
        Car dailyCommuter = new Car("Toyota Echo");
        Car truck = new Car("Tacoma");
        Car muscleCar = new Car("Supra");
        Car luxuryVehicle = new Car("Lexus is500");
    }
}
