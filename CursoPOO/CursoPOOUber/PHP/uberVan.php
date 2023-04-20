<?php
require_once("car.php");
class UberVan extends Car{
    public $typeCarAccepted;
    public $seatsMaterial;
  //protected $passenger;

    public function __construct($license,$driver,$typeCarAccepted,$seatsMaterial){
        parent::__construct($license,$driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    public function setPassenger($passenger){
        if ($passenger==6) {
            $this->passenger = $passenger;
        } else {
            echo "
            Deben ser 6 los pasajeros para UberVan
            ";
        }
        
    }
}
