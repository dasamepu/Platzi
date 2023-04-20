<?php

class Car{
    public $id;
    public $license;
    public $driver;
    protected $passenger; 

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        if ($this->passenger != null) {
        echo "license: $this->license, 
        conductor: {$this->driver->name}, 
        Numero de pasajeros: $this->passenger
        
        ";
        }
    }

    public function getPassenger(){
        return $this->passenger;
    }

    public function setPassenger($passenger){
        if ($passenger==4) {
            $this->passenger = $passenger;
        } else {
            echo "
            Deben ser 4 los pasageros para este tipo Uber
            ";
        }
        
    }
}