<?php

require("car.php");
require_once("account.php");

$car1 = new Car("ASD123", new Account("Andres", "AND123"));
$car1->printDataCar();

$car2 = new Car("GHJ867", new Account("Julio", "JUL123"));
$car2->printDataCar();

