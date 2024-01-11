package de.cubevale.core.api.database;

import java.util.HashMap;

public interface DatabaseTable {

    void delete();

    boolean exists();

    DatabaseEntry getEntry(String keyColumn, Object keyValue);

    boolean deleteEntry(String keyColumn, Object keyValue);

    boolean createEntry(HashMap<String, Object> values);
}
