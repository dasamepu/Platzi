<?php
require_once("payment.php");

class Tarjeta extends Car{
    public $card_num;
    public $card_date;
    public $cvv;

    public function __construct($id, $card_num, $card_date, $cvv){
        parent::__construct($id);
        $this->card_num = $card_num;
        $this->card_date = $card_date;
        $this->cvv = $cvv;
    }
}