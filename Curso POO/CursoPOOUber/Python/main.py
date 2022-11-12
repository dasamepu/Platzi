from car import Car

if __name__ == "__main__":
    print("hola mundo")
    car1 = Car()
    car1.license = "ABC123"
    car1.driver = "Juan"
    print(vars(car1))

    car2 = Car()
    car2.license = "DFG345"
    car2.driver = "Andres"
    print(vars(car2))