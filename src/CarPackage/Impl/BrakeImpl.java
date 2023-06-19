package CarPackage.Impl;

import Interfaces.Brake;

public class BrakeImpl implements Brake {
    @Override
    public void brake() {
        System.out.println("Applying Brakes to stop the vehicle");

    }
}
