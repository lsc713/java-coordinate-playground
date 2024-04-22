package fuelCharge;

public abstract class Car1 {

    private double tripDistance;

    public Car1(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    protected Car1() {
    }

    abstract double getDistancePerLiter();

    abstract double getTripDistance();

    abstract String getName();

    double getChargeQuantity() {
        return Math.round(getTripDistance() / getDistancePerLiter());
    }

}
