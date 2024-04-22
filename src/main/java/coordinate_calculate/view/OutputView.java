package coordinate_calculate.view;

import coordinate_calculate.model.Figure;

public class OutputView {

    private static final String FOUR_BLANK = "    ";
    private static final String PIPELINE = "|";
    private static final String POINT_MARJ = "*";
    private static final String PLUS_MARK = "+";
    private static final String NEW_LINE = System.lineSeparator();
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 24;

    private StringBuilder sb = new StringBuilder();
    public OutputView() {

    }

    public void showResult(String result) {
        System.out.println(result);
    }

    public void draw(Figure figure) {
        drawVerticalLineAndPoint(figure);
        drawHorizontalLine();
        drawHorizontalNumber();
        show();
    }

    private void drawVerticalLineAndPoint(Figure figure) {
        for (int y = MAX_VALUE; y >= MIN_VALUE; y--) {
            drawVerticalLine(y);
            drawVerticalPoint(y, figure);
            sb.append(NEW_LINE);
        }
    }

    private void drawVerticalPoint(int y, Figure figure) {
        for (int x = MIN_VALUE; x <= MAX_VALUE; x++) {
            if (figure.hasPoint(x, y)) {
                sb.append(String.format("%4s", POINT_MARJ));
            }
            sb.append(FOUR_BLANK);
        }
    }

    private void drawVerticalLine(int y) {
        if (y % 2 == 0) {
            sb.append(String.format("%4d|", y));
            return;
        }
        sb.append(FOUR_BLANK).append(PIPELINE);
    }

    private void drawHorizontalLine() {
        sb.append(String.format("%5s", PLUS_MARK));
        for (int x = MIN_VALUE; x <= MAX_VALUE; x++) {
            sb.append(String.format("%4s", "----"));
        }
    }

    private void drawHorizontalNumber() {
        sb.append(NEW_LINE);
        sb.append(String.format("%4s", 0));

        for (int x = MIN_VALUE; x <= MAX_VALUE; x++) {
            if (x % 2 == 0) {
                sb.append(String.format("%4s", x));
                continue;
            }
            sb.append(FOUR_BLANK);
        }
    }

    private void show() {
        System.out.println(sb.toString());
        System.out.println();
    }

}
