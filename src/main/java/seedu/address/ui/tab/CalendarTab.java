package seedu.address.ui.tab;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import seedu.address.commons.core.LogsCenter;
import seedu.address.logic.Logic;
import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.ui.CommandBox;
import seedu.address.ui.HelpWindow;
import seedu.address.ui.ResultDisplay;
import seedu.address.ui.UiPart;
import seedu.address.ui.calendar.CalendarController;
import seedu.address.ui.calendar.CalendarController2;
import seedu.address.ui.panel.FinanceListPanel;
import seedu.address.ui.panel.PersonListPanel;

import java.net.URL;
import java.util.logging.Logger;

/**
 * The calendar tab.
 */
public class CalendarTab extends UiPart<Region> {

    private static final String FXML = "CalendarTab.fxml";

    private final Logger logger = LogsCenter.getLogger(getClass());

    private Logic logic;

    // Independent Ui parts residing in this Ui container
    private PersonListPanel personListPanel;
    private ResultDisplay resultDisplay;

    private final HelpWindow helpWindow;
    private final TabPane tabPane;
    @FXML
    private StackPane commandBoxPlaceholder;

    @FXML
    private StackPane calendarPlaceholder;

    @FXML
    private StackPane resultDisplayPlaceholder;

    /**
     * Creates a {@code CalendarTab}.
     */
    public CalendarTab(TabPane tabPane) {
        super(FXML);
        helpWindow = new HelpWindow();
        this.tabPane = tabPane;
    }

    public void setup(Logic logic) {
        this.logic = logic;
        setInnerParts();
    }

    private void setInnerParts() {
        CalendarController2 calendarController = new CalendarController2(logic.getEventList());
        calendarPlaceholder.getChildren().add(calendarController.getRoot());

        resultDisplay = new ResultDisplay();
        resultDisplayPlaceholder.getChildren().add(resultDisplay.getRoot());

        CommandBox commandBox = new CommandBox(this::executeCommand);
        commandBoxPlaceholder.getChildren().add(commandBox.getRoot());
    }

    /**
     * Executes the command and returns the result.
     *
     * @see seedu.address.logic.Logic#execute(String)
     */
    private CommandResult executeCommand(String commandText) throws CommandException, ParseException {
        try {
            CommandResult commandResult = logic.execute(commandText);
            logger.info("Result: " + commandResult.getFeedbackToUser());
            resultDisplay.setFeedbackToUser(commandResult.getFeedbackToUser());

            return commandResult;
        } catch (CommandException | ParseException e) {
            logger.info("An error occurred while executing command: " + commandText);
            resultDisplay.setFeedbackToUser(e.getMessage());
            throw e;
        }
    }
}
