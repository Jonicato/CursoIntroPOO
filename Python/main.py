from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo!")
    car = Car("AMS214", Account("Eduardo Herrera", "EDU180"))
    print(vars(car))
    print(vars(car.driver))
    
    car2 = Car("ANS123", Account("Aby Gallegos", "ABY100"))
    print(vars(car2))
    print(vars(car2.driver))