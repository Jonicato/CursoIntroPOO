const car = new Car("OTP232", new Account("Red Kamo", "KAD23"));
car.passeger = 4;
car.printDataCar();

const car2 = new Car("ABC123", new Account("Jonathan Rodríguez", "ROD007"));
car2.passeger = 2;
car2.printDataCar();

const car3 = new UberX("PLA123", new Account("Azareth Gallegos", "AZA710"), "Chevrolet", "Tracker");
car3.printDataCar();

const car4 = new UberBlack("UBR007", new Account("Armando Garcia", "ARM999"), "Ford", "Piel");
car4.printDataCar();