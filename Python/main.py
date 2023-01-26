from car import Car
from uberX import UberX
from account import Account

if __name__ == "__main__":
    print("Hola Mundo!")
    car = Car("AMS214", Account("Eduardo Herrera", "EDU180"))
    print(vars(car))
    print(vars(car.driver))
    
    car2 = Car("ANS123", Account("Aby Gallegos", "ABY100"))
    print(vars(car2))
    print(vars(car2.driver))
    
    car3 = UberX("PYT001", Account("Azareth Gallegos", "AZA710"), "Chevrolet", "Tracker");
    print(vars(car3))
    print(vars(car3.driver))