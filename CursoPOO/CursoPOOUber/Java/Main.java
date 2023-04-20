class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car UberDeWill = new UberX("ASD123", new Account("Will", "WILL123", "will@email.com", "SuperSecurePassword"), "Chevrolet", "Spark");
        UberDeWill.setPassenger(4);
        UberDeWill.printDataCar(); 

        Car UberDeJuan = new UberVan("GHJ352", new Account("Juan", "AND123", "and@email.com", "ContraseñaIndecifrable"));
        UberDeJuan.setPassenger(6);
        UberDeJuan.printDataCar();

        /* Tarjeta pay1 = new Tarjeta("ID123456", 1234567890, 123,  "11/5");
        pay1.printDataPaymentTarjeta();

        Account vegeta777 = new User("ID756", "VEGETA ", "VEG1312313 ", "veg@email.com", "Contraseña123");
        vegeta777.printDataAccount(); */
    }
}

