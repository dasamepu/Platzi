class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car1 = new Car("ABC123", new Account("Juan", "JUAN123"));
        car1.passenger = 4;
        car1.printDataCar();

        Car car2 = new Car("DAL456", new Account("Andres", "ANDRES123"));
        car2.passenger = 7;
        car2.printDataCar();

        Car car3 = new Car("CVB445", new Account("Antonio", "ANTO123"));
        car3.passenger = 7;
        car3.printDataCar(); 
    }
}

