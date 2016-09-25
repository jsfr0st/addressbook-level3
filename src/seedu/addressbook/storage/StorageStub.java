package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub extends Storage {
    
    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
     // Return nothing
        return;
    }
    
    @Override
    public AddressBook load() throws StorageOperationException {
        // Return dummy object
        return new AddressBook();
    }
    
    @Override
    public String getPath() {
     // Return nothing
        return null;
    }
}
