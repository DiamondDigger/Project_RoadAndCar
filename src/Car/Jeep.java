package Car;

public class Jeep extends BaseModel implements Actions {
    @Override
    public void move() {
        this.odometer += 1.0;
    }

    @Override
    public void fuelUse() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void broken() {

    }

    @Override
    public void addFuel() {

    }
}
