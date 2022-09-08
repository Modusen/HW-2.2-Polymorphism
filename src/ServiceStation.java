public class ServiceStation{
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем автомобиль " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
                System.out.println(" #" + (i + 1));
            }
            transport.checkEngine();
        }
    }
}