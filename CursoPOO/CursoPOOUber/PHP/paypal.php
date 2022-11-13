<?php
require_once("payment.php");

class Paypal extends Car{
    public $email;

    public function __construct($id, $email){
        parent::__construct($id);
        $this->email = $email;
    }
}