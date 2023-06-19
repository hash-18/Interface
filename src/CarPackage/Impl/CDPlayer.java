package CarPackage.Impl;

import Interfaces.Music;

public class CDPlayer implements Music {
    @Override
    public void start() {
        System.out.println("Starting MUSIC");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MUSIC");
    }
}
