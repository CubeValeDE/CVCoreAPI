package de.cubevale.core.api.region;

import de.cubevale.core.api.user.User;

import javax.annotation.CheckReturnValue;
import java.util.ArrayList;

public interface Region {

    /**
     * Get the region id
     * @return
     */
    String getId();

    /**
     * Get the owner of the region
     * @return
     */
    User getOwner();

    /**
     * Set the owner of the region
     * @param user
     * @return
     */
    @CheckReturnValue
    default Region setOwner(User user) {
        return this;
    }

    /**
     * Get a list of all members of the region
     * @return
     */
    ArrayList<String> getMembers();

    /**
     * Add a member to the region
     * @param user
     * @return
     */
    @CheckReturnValue
    default Region addMember(User user) {
        return this;
    }

    /**
     * Remove a member from the region
     * @param user
     * @return
     */
    @CheckReturnValue
    default Region removeMember(User user) {
        return this;
    }

    /**
     * Get the description of the region
     * @return
     */
    String getDescription();

    /**
     * Set the description of the region
     * @param description
     * @return
     */
    @CheckReturnValue
    default Region setDescription(String description) {
        return this;
    }

    /**
     * Get the area of the region
     * @return
     */
    Area getArea();

    /**
     * Set the area of the region
     * @param area
     * @return
     */
    @CheckReturnValue
    default Region setArea(Area area) {
        return this;
    }

    /**
     * Reload the region data and replace the current region-object
     * @return
     */
    default Region refresh() {
        return this;
    }

    void update();
}
