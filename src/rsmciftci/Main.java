package rsmciftci;


import rsmciftci.creationalpatterns.builder.first.User;
import rsmciftci.creationalpatterns.builder.second.builder.CarBuilder;
import rsmciftci.creationalpatterns.builder.second.builder.CarManualBuilder;
import rsmciftci.creationalpatterns.builder.second.car.Car;
import rsmciftci.creationalpatterns.builder.second.car.Manual;
import rsmciftci.creationalpatterns.builder.second.director.Director;

public class Main {
    public static void main(String[] args){

        Director director = new Director();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println(carManual.print());

        System.out.println("\n---------------------\n");

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car.print());


    }
}



