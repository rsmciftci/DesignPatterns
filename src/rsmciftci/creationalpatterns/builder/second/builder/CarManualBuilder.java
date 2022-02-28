package rsmciftci.creationalpatterns.builder.second.builder;

import rsmciftci.creationalpatterns.builder.second.car.CarType;
import rsmciftci.creationalpatterns.builder.second.car.Manual;
import rsmciftci.creationalpatterns.builder.second.components.Engine;
import rsmciftci.creationalpatterns.builder.second.components.GPSNavigator;
import rsmciftci.creationalpatterns.builder.second.components.Transmission;
import rsmciftci.creationalpatterns.builder.second.components.TripComputer;

public class CarManualBuilder implements Builder{

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType =carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult(){
        return new Manual(carType, seats, engine, transmission,tripComputer,gpsNavigator);
    }
}