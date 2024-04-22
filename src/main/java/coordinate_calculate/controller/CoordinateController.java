package coordinate_calculate.controller;

import coordinate_calculate.model.Figure;
import coordinate_calculate.model.Line;
import coordinate_calculate.view.InputView;
import coordinate_calculate.view.OutputView;

public class CoordinateController {
    public void run() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        Figure figure = inputView.input();

        outputView.draw(figure);
        outputView.showResult(figure.getAreaInfo());
    }
}
