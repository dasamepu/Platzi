<?php
require_once("payment.php");

class Efectivo extends Car{
    public function __construct($id){
        parent::__construct($id);
    }
}