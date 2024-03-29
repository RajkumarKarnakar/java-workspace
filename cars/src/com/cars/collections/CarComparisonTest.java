package com.cars.collections;

import com.cars.Car;
import org.junit.jupiter.api.*;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarComparisonTest {
    Collection<Car> cars;
    Car suburu, tesla, honda;

    @BeforeEach
    public void setUp(TestInfo info) throws Exception {
        System.out.format("%nPerforming %s%n", info.getTestMethod().get().getName());

        this.cars = new ArrayList<>();
        this.suburu = new Car("Subaru", "Impreza", 12);
        this.tesla = new Car("Tesla", "Model S", 4849);
        this.honda = new Car("Honda", "Civic", 845);
        this.cars.addAll(List.of(suburu, tesla, honda));
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("Results");
        System.out.println();
        this.cars.stream()
                .map(car -> String.format("%s %s", car.getMake(), car.getModel()))
                .forEach(System.out::println);
    }
    public static void lastPeek(){

    }

    @Test
    public void removeTest() {
        this.cars.remove(honda);
        this.cars.remove(new Car("Subaru", "Impreza", 0.0));

        assertEquals(1, this.cars.size());

    }

    @Test
    public void containsTest() {
        assertTrue(this.cars.contains(new Car("Tesla", "Model S", 48947)));
        assertTrue(this.cars.contains(honda));
        assertTrue(this.cars.contains(suburu));
    }

    @Test
    public void removeAllIdentityTest() {
        this.cars.removeAll(Arrays.asList(
                suburu,
                tesla,
                new Car("Honda", "Civic", 1212211)));
        assertEquals(0,this.cars.size());
    }

    public static void main(String[] args) {
        System.out.println();
    }
    
}












