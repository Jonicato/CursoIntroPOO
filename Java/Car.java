class Car {
    /* Variables variables */
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver) { /* Variables locales */
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + "\nName Driver: " + driver.name);
    }
}
