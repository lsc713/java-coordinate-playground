package coordinate_calculate;

import coordinate_calculate.model.Line;
import coordinate_calculate.model.Point;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

class LineTest {
    @Test
    void exception() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15), new Point(24, 24));
        Assertions.assertThatThrownBy(() -> new Line(points))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void calculateDistance() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15));
        Line line = new Line(points);
        double distance = line.getArea();

        double expected = 6.4;

        Assertions.assertThat(distance).isEqualTo(expected, Offset.offset(0.1));
    }

}