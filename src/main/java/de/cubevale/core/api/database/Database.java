package de.cubevale.core.api.database;

import java.util.HashMap;

public interface Database {

    DatabaseTable getTable(String name);

    boolean createTable(String name, HashMap<String, String> columns);

    boolean deleteTable(String name);
}
