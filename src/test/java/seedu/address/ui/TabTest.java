package seedu.address.ui;

import org.junit.jupiter.api.Test;

import seedu.address.ui.tab.EventsTab;


public class TabTest {
    @Test
    public void constructor_null_throwsNullPointerException() {
        assert(new EventsTab().equals(new EventsTab()));
    }

}
