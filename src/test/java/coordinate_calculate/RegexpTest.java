package coordinate_calculate;

import coordinate_calculate.model.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegexpTest {

    private String lineInput = "(10,10)-(14,15)";
    @Test
    void 선입력_매칭() {
        String regexp = "\\(\\d{1,2},\\d{1,2}\\)-\\(\\d{1,2},\\d{1,2}\\)";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(lineInput);

        Assertions.assertThat(matcher
            .find()).isTrue();
    }

    @Test
    void 선입력_파싱() {
        String regexp = "\\((\\d{1,2}),(\\d{1,2})\\)";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(lineInput);

        List<Point> actual = new ArrayList<>();
        while (matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));

            actual.add(new Point(x, y));
        }

        List<Point> expected = Arrays.asList(new Point(10, 10), new Point(14, 15));

        Assertions.assertThat(actual).isEqualTo(expected);
    }

}
