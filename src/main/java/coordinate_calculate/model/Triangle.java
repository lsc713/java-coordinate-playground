package coordinate_calculate.model;

import java.util.List;

public class Triangle extends AbstractFigure{
    public static final int POINT_SIZE = 3;
    private static final String INVALID_POINT_SIZE = String.format("삼각형을 그리기 위한 점은 %s개가 필요합니다",
        POINT_SIZE);
    private static final String INVALID_TRIANGLE_SHAPE = "유효하지 않은 삼각형입니다";
    private static final String RESULT_PREFIX = "삼각형 넓이는";

    public Triangle(List<Point> points) {
        super(points);
        checkInvalidTriangle(points);
    }

    private static void checkInvalidTriangle(List<Point> points) {
        if (points.size() != POINT_SIZE) {
            throw new IllegalArgumentException(INVALID_POINT_SIZE);
        }

        if (getSlope(points.get(0), points.get(1)) == getSlope(points.get(0), points.get(2))) {
            throw new IllegalArgumentException(INVALID_TRIANGLE_SHAPE);
        }
    }

    private static double getSlope(Point point, Point other) {
        return point.calculateSlope(other);
    }

    @Override
    public double getArea() {
        double a = distance(this.points.get(0), this.points.get(1));
        double b = distance(this.points.get(0), this.points.get(2));
        double c = distance(this.points.get(1), this.points.get(2));

        double s = (a+b+c)/2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String getAreaInfo() {
        return RESULT_PREFIX + getArea();
    }

    private double distance(Point pointA, Point pointB) {
        return pointA.calculateDistance(pointB);
    }
}
