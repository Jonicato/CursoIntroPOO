class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");

        Car car = new Car("AMQ123", new Account("Andrés Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("LKD678", new Account("Azareth Gallegos", "AZA109"));
        car.passenger = 3;;
        car2.printDataCar();
    }
}