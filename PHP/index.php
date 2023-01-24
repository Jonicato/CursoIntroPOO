<?php
require_once("car.php");
require_once("uberX.php");
require_once("account.php");

$car = new Car("AWS123", new Account("Sara Sifuentes", "SARA170"));
$car->printDataCar();

$uberX = new UberX("UBER123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();
?>