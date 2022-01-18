package principles.di;

public class CarOwner extends MotorCar implements RefuelCar {
    @Override
    public boolean refuelCar() {
        return true;
    }
}
