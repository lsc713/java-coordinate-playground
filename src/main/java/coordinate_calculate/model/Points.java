//package coordinate_calculate.model;
//
//import java.util.List;
//
//public class Points {
//
//    private List<Point> points;
//
//    public Points(List<Point> points) {
//        this.points = points;
//    }
//
//    public double getDifferenceX() {
//        if (points.size() != 2) {
//            throw new IllegalArgumentException("Points 객체는 두 개의 점을 가져야 합니다.");
//        }
//        return Math.abs(points.get(1).getX() - points.get(0).getX());
//    }
//
//    public double getDifferenceY() {
//        if (points.size() != 2) {
//            throw new IllegalArgumentException("Points 객체는 두 개의 점을 가져야합니다.");
//        }
//        return Math.abs(points.get(1).getY() - points.get(0).getY());
//    }
//}
