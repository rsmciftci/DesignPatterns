package rsmciftci.creationalpatterns.builder.second.builder;

import rsmciftci.creationalpatterns.builder.second.car.CarType;
import rsmciftci.creationalpatterns.builder.second.components.Engine;
import rsmciftci.creationalpatterns.builder.second.components.GPSNavigator;
import rsmciftci.creationalpatterns.builder.second.components.Transmission;
import rsmciftci.creationalpatterns.builder.second.components.TripComputer;

public interface Builder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
