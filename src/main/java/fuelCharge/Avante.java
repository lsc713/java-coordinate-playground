package fuelCharge;

public class Avante implements Car {

    private double tripDistance;

    public Avante(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */

    @Override
    public double getDistancePerLiter() {
        return 15.0;
    }

    /**
     * 여행하려는 거리
     */

    @Override
    public double getTripDistance() {
        return tripDistance;
    }

    @Override
    public double getChargeQuantity() {
        return Math.round(getTripDistance() / getDistancePerLiter());
    }

    @Override
    public String getName() {
        return "fuelCharge.Avante";
    }
}
