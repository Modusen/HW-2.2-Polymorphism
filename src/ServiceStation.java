public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем автомобиль " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
                System.out.println(" #" + (i + 1));
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем фургон " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
                System.out.println(" #" + (i + 1));
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем велосипед " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
                System.out.println(" #" + (i + 1));
            }
        }
    }
}