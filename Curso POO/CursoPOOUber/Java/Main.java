class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car1 = new Car();
        car1.license = "ABC123";
        car1.driver = "Juan";
        car1.passenger = 4;
        car1.printDataCar();

        Car car2 = new Car();
        car2.license = "DAL456";
        car2.driver = "Andres";
        car2.passenger = 7;
        car2.printDataCar();
    }
}

