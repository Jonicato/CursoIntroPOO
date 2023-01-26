class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

        Car car = new Car("AMQ123", new Account("Andrés Herrera", "AND123"));
        car.setPassenger(4);
        car.printDataCar();

        UberVan uberVan = new UberVan("ABC234", new Account("Azareth Gallegos", "AZA710"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        /* Car car2 = new Car("LKD678", new Account("Azareth Gallegos", "AZA109"));
        car.setPassenger(4);
        car2.printDataCar(); */
    }
}