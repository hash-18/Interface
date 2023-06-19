package CarPackage.Impl;

import Interfaces.Music;
import Interfaces.Brake;
import Interfaces.Engine;

public class Car {

    private Engine engine;
    private Music player=new CDPlayer();
    private Brake brake=new BrakeImpl();

    public Car() {
        this.engine=new PowerEngine();
    }

    public Car(Engine engine) {
        this.engine = engine;
    }


    public void brake() {
        brake.brake();
    }


    public void startEngine() {
        engine.start();
    }


    public void stopEngine() {
        engine.stop();
    }

    public void UpgradeEngine(Engine engine)
    {
        this.engine=engine;
    }

    public void accEngine() {
        engine.acc();
    }


    public void startMusic() {
        player.start();
    }


    public void stopMusic() {
        player.stop();
    }
}

