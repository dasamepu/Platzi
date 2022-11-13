<?php

require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("uberBlack.php");
require_once("uberVan.php");
require_once("account.php");

$uberX = new UberX("ASD123", new Account("Andres", "AND123"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("DFG123", new Account("Andrea", "ANA123"), "Dodge", "NOCDEMODELOS");
$uberPool->printDataCar();