package fuelCharge;

public class Sonata implements Car {

    private double tripDistance;

    public Sonata(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public double getDistancePerLiter() {
        return 10.0;
    }

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public String getName() {
        return "fuelCharge.Sonata";
    }

    @Override
    public double getChargeQuantity() {
        return Math.round(getTripDistance() / getDistancePerLiter());
    }
}
