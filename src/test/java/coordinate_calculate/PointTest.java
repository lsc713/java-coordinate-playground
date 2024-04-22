package coordinate_calculate;

import coordinate_calculate.model.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {
    @Test
    void exception() {
        Assertions.assertThatThrownBy(() -> new Point(0, 1))
            .isInstanceOf(IllegalArgumentException.class);
        Assertions.assertThatThrownBy(() -> new Point(24, 25))
            .isInstanceOf(IllegalArgumentException.class);
    }


}