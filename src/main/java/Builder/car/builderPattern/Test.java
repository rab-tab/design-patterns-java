package Builder.car.builderPattern;


import Builder.car.builderPattern.constructors.CarWithConstructor;
import Builder.car.builderPattern.setters.CarWithSetters;

import java.util.ArrayList;
import java.util.List;


//https://github.com/anomaly2104/coding-recipies/blob/master/src/main/java/com/uditagarwal/builder_pattern/builder/CarWithLombokBuilder.java
public class Test {
    public static void main(String[] args) {

        final Engine engine = new Engine();
        final List<Seat> seats = new ArrayList<>();
        final Steering steering = new Steering();
        final SunRoof sunRoof = new SunRoof();
        final AirBags airBags = new AirBags();
        final MusicSystem musicSystem = new MusicSystem();
        final CentralLock centralLock = new CentralLock();

        /**
         * Constructor
         * 1. So many nulls you will to put.
         * 2. Makes constructor ugly.
         */
        CarWithConstructor carWithConstructor = new CarWithConstructor(engine, Fuel.PETROL, seats, steering,
                null, null, null, null);

        CarWithConstructor carWithConstructor1 = new CarWithConstructor(engine, Fuel.PETROL, seats, steering,
                null, centralLock, null, null);

        /**
         * Setters
         * 1. You can make half baked object by missing required properties.
         * 2. Object becomes mutable. You can change its properties even after its construction.
         */
        CarWithSetters carWithSetters = new CarWithSetters();
        carWithSetters.setEngine(engine);
        carWithSetters.setSteering(steering);
        // We forgot to set required properties seats and fuel.
        carWithSetters.setAirBags(airBags);
        carWithSetters.setMusicSystem(musicSystem);
        // Construction completes here.

        // We can just replace the engine with new one.
        carWithSetters.setEngine(new Engine());

        /**
         * Using builders
         * 1. Simple construction.
         * 2. Looks clean. More Readable
         * 3. Object remains immutable once it is build.
         */


        CarWithBuilder carWithBuilder = CarWithBuilder.builder()
                .withEngine(engine)
                .withSteering(steering)
                .withSeats(seats)
                .withFuel(Fuel.DIESEL)
                .withSunRoof(sunRoof)
                .withMusicSystem(musicSystem).build();

        CarWithBuilder carWithBuilder1 = CarWithBuilder.builder()
                .withEngine(engine)
                .withSteering(steering)
                .withSeats(seats)
                .withFuel(Fuel.DIESEL)
                .withAirBags(airBags)
                .withCentralLock(centralLock)
                .withSunRoof(sunRoof)
                .withMusicSystem(musicSystem).build();

        CarWithLombokBuilder carWithLombokBuilder = CarWithLombokBuilder.builder()
                .engine(engine)
                .steering(steering)
                .seats(seats)
                .fuel(Fuel.PETROL)
                .airBags(airBags)
                .build();
    }
}
