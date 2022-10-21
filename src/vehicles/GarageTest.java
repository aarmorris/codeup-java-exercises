package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.setVehicles(new Vehicle[4]);
        Car dailyCommuter = new Car("Toyota Echo");
        Car truck = new Car("Tacoma");
        Car muscleCar = new Car("Challenger");
        Car luxuryVehicle = new Car("Lexus is500");
        Vehicle[] garageVehicles = new Vehicle[4];
        garageVehicles[0] = dailyCommuter;
        garageVehicles[1] = truck;
        garageVehicles[2] = muscleCar;
        garageVehicles[3] = luxuryVehicle;
        garage.setVehicles(garageVehicles);
        garage.alarmCascade();
//        garage.getVehicles()[0] = new Motorcycle("Honda");
        System.out.println(garage.getVehicles()[0].getName());
    }
}
