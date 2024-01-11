package de.cubevale.core.api.region;

import org.bukkit.Location;

public interface Area {

    /**
     * Get the first location of the area
     * @return
     */
    Location getMinLocation();

    /**
     * Set the first location of the area
     * @param location
     */
    void setMinLocation(Location location);

    /**
     * Get the second location of the area
     * @return
     */
    Location getMaxLocation();

    /**
     * Set the second location of the area
     */
    void setMaxLocation();
}
