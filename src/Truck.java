public class Truck extends AutoTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверка двигателя: WROOM-WROOM!!!!!");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}