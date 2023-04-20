<?php

require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("uberBlack.php");
require_once("uberVan.php");
require_once("account.php");
require_once("payment.php");
require_once("tarjeta.php");
require_once("paypal.php");
require_once("efectivo.php");


$UberDeAndres = new UberVan("ASD123", new Account("Andres", "AND123"), "Chevrolet", "Spark");
$UberDeAndres->setPassenger(6);
$UberDeAndres->printDataCar();


$UberDeJuan = new UberX("AUB957", new Account("Juan", "JUA091"), "Chevrolet", "Spark");
$UberDeJuan->setPassenger(4);
$UberDeJuan->printDataCar();


/* $pay1 = new Payment("ID098");
$pay1->printDataPayment(); */