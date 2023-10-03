import main.HW.Car;
import main.HW.Motorcycle;
import main.HW.Vehicle;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;


public class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void prepareData() {
        car = new Car("Mercedes", "W213", 2020);
        motorcycle = new Motorcycle("Ford", "Ranger T6", 2019);
    }

    @Test
    void carIsInstanceOfVehicleTest() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carObjectHasFourWheelsTest() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleObjectHasTwoWheelsTest() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carCheckTestDriveSpeedTest() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleCheckTestDriveSpeedTest() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carCheckParkModeSpeedTest() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleCheckParkModeSpeedTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}