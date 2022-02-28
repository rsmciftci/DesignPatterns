package rsmciftci.creationalpatterns.builder.second.components;

public class Engine {

    private final double volume;
    private double milage;
    private boolean started;

    public Engine(double volume, double milage) {
        this.volume = volume;
        this.milage = milage;
    }
    public void on(){
        started = true;
    }
    public void off(){
        started = false;
    }
    public boolean isStarted(){
        return started;
    }
    public void go(double milage){
        if (started){
            this.milage += milage;
        }else{
            System.err.println("Cannot go(), you must start engine first");
        }
    }

    public double getVolume(){
        return volume;
    }

    public double getMilage(){
        return milage;
    }

}
