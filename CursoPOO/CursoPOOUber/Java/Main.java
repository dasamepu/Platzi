class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car UberDeWill = new UberX("ASD123", new Account("Will", "WILL123"), "Chevrolet", "Spark");
        UberDeWill.passenger = 7;
        UberDeWill.printDataCar(); 

        Payment pay1 = new PayPal(12334546, "user@example.com");
        pay1.printDataPayment();
    }
}

