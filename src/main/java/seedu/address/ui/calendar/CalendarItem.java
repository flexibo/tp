package seedu.address.ui.calendar;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import seedu.address.ui.UiPart;

import java.net.URL;

import static javafx.scene.paint.Color.GREEN;

public class CalendarItem extends UiPart<Region> {
    private static final String FXML = "CalendarItem.fxml";

    private boolean isToday;
    @FXML
    private AnchorPane pane;
    @FXML
    private Label day;
    public CalendarItem(int day) {
        super(FXML);
        this.day.setText(String.valueOf(day));
        this.day.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public void setToday(boolean isToday) {
        this.isToday = isToday;
    }
}
