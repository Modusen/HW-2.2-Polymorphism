public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", 4);
        Car car2 = new Car("Ferrari", 4);

        Truck truck = new Truck("Volvo", 6);
        Truck truck2 = new Truck("Scania", 8);

        Bicycle bicycle = new Bicycle("Forward", 2);
        Bicycle bicycle2 = new Bicycle("Stels", 2);

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}