package de.cubevale.core.api.region;

import javax.annotation.CheckReturnValue;
import java.util.List;

public interface Street {

    /**
     * Get the internal street id
     * @return
     */
    int getId();

    /**
     * Get the unique identifier of the street
     * @return
     */
    String getIdentifier();

    /**
     * Set the unique identifier of the street
     * @param identifier identifier as string
     * @return
     */
    @CheckReturnValue
    default Street setIdentifier(String identifier) {
        return this;
    }

    /**
     * Get the street name
     * @return
     */
    String getName();

    /**
     * Set the name of the street
     * @param name name as string
     * @return
     */
    @CheckReturnValue
    default Street setName(String name) {
        return this;
    }

    /**
     * Get the area of the street
     * @return
     */
    Area getArea();

    /**
     * Set the area of the street
     * @param area area as area-object
     * @return
     */
    default Street setArea(Area area) {
        return this;
    }

    /**
     * Get a list of all plots next to the street
     * @return
     */
    List<Plot> getPlots();

    void update();
}
