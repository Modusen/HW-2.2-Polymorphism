public class Car extends AutoTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверка двигателя: Wroom-Wroom");
    }
}