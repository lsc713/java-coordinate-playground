package coordinate_calculate.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    private static final String DUPLICATE_POINT = "중복된 좌표가 포함되어 있습니다.";

    private static final Map<Integer, Function<List<Point>, Figure>> createMap;
    static{
        createMap = new HashMap<>();
        createMap.put(Line.POINT_SIZE, Line::new);
        createMap.put(Rectangular.POINT_SIZE, Rectangular::new);
    }

    public static Figure create(List<Point> points) {
        checkDuplicatePoint(points);
        return createMap.get(points.size()).apply(points);
    }

    private static void checkDuplicatePoint(List<Point> points) {
        if (points.size() != new HashSet<>(points).size()) {
            throw new IllegalArgumentException(DUPLICATE_POINT);
        }
    }
}
