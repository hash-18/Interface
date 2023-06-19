package CarPackage.Impl;

class RunCarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        ;
        car.stopEngine();
        car.UpgradeEngine(new ElectricEngine());
        car.startEngine();
        ;
        car.stopEngine();
        car.startMusic();
        car.brake();
    }
}
