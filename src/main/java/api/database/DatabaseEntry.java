package de.cubevale.core.api.database;

import de.cubevale.core.api.user.User;
import org.bukkit.inventory.ItemStack;

import javax.annotation.CheckReturnValue;

public interface DatabaseEntry {

    void delete();

    boolean exists();

    String getString(String column);

    @CheckReturnValue
    default DatabaseEntry setString(String column, String value) {
        return this;
    }

    int getInteger(String column);

    @CheckReturnValue
    default DatabaseEntry setInteger(String column, int value) {
        return this;
    }

    boolean getBoolean(String column);

    @CheckReturnValue
    default DatabaseEntry setBoolean(String column, boolean value) {
        return this;
    }

    long getLong(String column);

    @CheckReturnValue
    default DatabaseEntry setLong(String column, long value) {
        return this;
    }

    double getDouble(String column);

    @CheckReturnValue
    default DatabaseEntry setDouble(String column, double value) {
        return this;
    }

    float getFloat(String column);

    @CheckReturnValue
    default DatabaseEntry setFloat(String column, float value) {
        return this;
    }

    byte getByte(String column);

    @CheckReturnValue
    default DatabaseEntry setByte(String column, byte value) {
        return this;
    }

    User getUser(String column);

    @CheckReturnValue
    default DatabaseEntry setUser(String column, User value) {
        return this;
    }

    ItemStack getItemStack(String column);

    @CheckReturnValue
    default DatabaseEntry setItemStack(String column, ItemStack value) {
        return this;
    }

    void update();
}
