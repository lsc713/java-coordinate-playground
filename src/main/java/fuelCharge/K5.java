package fuelCharge;

public class K5 implements Car {

    private double tripDistance;

    public K5(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return 13.0;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "fuelCharge.K5";
    }

    @Override
    public double getChargeQuantity() {
        return Math.round(getTripDistance() / getDistancePerLiter());
    }
}
