package principles.di;

public class ElectricCar implements Car {
    @Override
    public void carType() {
        System.out.println("This is a Electric Car");
    }
}
