from car import Car
from account import Account

if __name__ == "__main__":
    print("hola mundo")
    
    car1 = Car("ABC123",Account("Juan", "JUAN123"))
    print(vars(car1))
    print(vars(car1.driver))