class Tarjeta extends Payment{
    Integer card_number;
    Integer cvv;
    String card_date;
    
    public Tarjeta(Integer id,Integer card_number, Integer cvv, String card_date){
        super(id);
        this.card_number = card_number;
        this.cvv = cvv;
        this.card_date = card_date;
    }
    
}