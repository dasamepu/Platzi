class Tarjeta extends Payment{
    Integer card_number;
    Integer cvv;
    String card_date;
    
    public Tarjeta(String id,Integer card_number, Integer cvv, String card_date){
        super();
        this.card_number = card_number;
        this.cvv = cvv;
        this.card_date = card_date;
    }
    
    void printDataPaymentTarjeta(){
        System.out.println("card_number: " + card_number + " cvv: " + cvv + " card_date: " + card_date);
    }
}