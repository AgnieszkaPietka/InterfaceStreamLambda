package pl.programator.api;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void shouldReturnCarsOnly_when_FILTER_CARS_predicate_used() {
        // TODO 1 tworzymy listę vehicli (3 samochody, 7 innych)
        List<Vehicle> listToBeFiltered = Arrays.asList(
        new Car(),
        new Car(),
        new Car(),
        new Boat(),
        new Boat(),
        new Boat(),
        new Plane(),
        new Plane(),
        new Plane()
        );

        // TODO 2 filtrujemy samochody używając metody staycznej interfejsów

        // List<Vehicle> filteredList = Vehicle.filterList(listToBeFiltered, Vehicle.FILTER_CARS);
        List<Vehicle> filteredList = Vehicle.filterList(listToBeFiltered, v -> v instanceof Car);

        // TODO 3 sprawdzamy czy właściwa ilość elementów

        assertEquals(3, filteredList.size());
    }
}