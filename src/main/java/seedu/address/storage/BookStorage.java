package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataLoadingException;
import seedu.address.model.*;
import seedu.address.storage.events.EventsBookStorage;
import seedu.address.storage.finance.FinancesStorage;

/**
 * API of the BookStorage component
 */
public interface BookStorage extends AddressBookStorage, UserPrefsStorage, EventsBookStorage, FinancesStorage {

    @Override
    Optional<UserPrefs> readUserPrefs() throws DataLoadingException;

    @Override
    void saveUserPrefs(ReadOnlyUserPrefs userPrefs) throws IOException;

    @Override
    Path getAddressBookFilePath();

    @Override
    Optional<ReadOnlyAddressBook> readAddressBook() throws DataLoadingException;

    @Override
    void saveAddressBook(ReadOnlyAddressBook addressBook) throws IOException;

    @Override
    Path getEventsBookFilePath();

    @Override
    Optional<ReadOnlyEventsBook> readEventsBook() throws DataLoadingException;

    @Override
    void saveEventsBook(ReadOnlyEventsBook eventsBook) throws IOException;

    /**
    @Override
    Path getFinancesBookFilePath();

    @Override
    Optional<ReadOnlyFinancesBook> readFinancesBook() throws DataLoadingException;

    @Override
    void saveFinancesBook(ReadOnlyFinancesBook financesBook) throws IOException;
    **/

}