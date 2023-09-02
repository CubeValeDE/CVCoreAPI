package de.cubevale.core.api.region;

import de.cubevale.core.api.User;

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
     */
    void setOwner(User user);

    /**
     * Get a list of all members of the region
     * @return
     */
    ArrayList<String> getMembers();

    /**
     * Add a member to the region
     * @param user
     */
    void addMember(User user);

    /**
     * Remove a member from the region
     * @param user
     */
    void removeMember(User user);

    /**
     * Get the description of the region
     * @return
     */
    String getDescription();

    /**
     * Set the description of the region
     * @param description
     */
    void setDescription(String description);

    /**
     * Get the area of the region
     * @return
     */
    Area getArea();

    /**
     * Set the area of the region
     * @param area
     */
    void setArea(Area area);
}
