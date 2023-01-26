<?php
class Car {
    private $id;
    private $license;
    private $driver;
    protected $passenger;

    public function __construct($license, $driver) {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar() {
        if ($this->passenger != null) {
            echo "license: $this->license, \nconductor: {$this->driver->name}, \ndocument: {$this->driver->document} \nPassengers: $this->passenger";
        }
    }

    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        if ($passenger == 4) {
            $this->passenger = $passenger;
        } else { 
            echo "Necesitas agregar 4 pasajeros";
        }
    }
}
?>