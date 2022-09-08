public abstract class Transport {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void check(Transport transport) {
        System.out.println("Обслуживаем автомобиль " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
            System.out.println(" #" + (i + 1));
        }
        transport.checkEngine();
    }

    protected abstract void checkEngine();

    public void updateTyre() {
        System.out.print("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
