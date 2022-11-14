class PayPal extends Payment {
    String email;

    public PayPal(String id, String email) {
        super(id);
        this.email = email;
    }
    
    void printDataPaymentPayPal(){
        System.out.println("id: " + id + "email: " + email);
    }
}