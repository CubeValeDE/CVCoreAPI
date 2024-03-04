package de.cubevale.core.api.region;

import de.cubevale.core.api.user.OnlineUser;
import de.cubevale.core.api.user.User;
import org.bukkit.Location;

import javax.annotation.CheckReturnValue;
import java.util.List;

public interface Region {

    /**
     * Get the region id
     * @return
     */
    int getId();

    /**
     * Get the owner of the region as user
     * @return
     */
    User getOwner();

    /**
     * Set the owner of the region as user
     * @param user
     * @return
     */
    @CheckReturnValue
    default Region setOwner(User user) {
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
     * Get all region users who have access to the region
     * @return
     */
    List<RegionUser> getRegionUsers();

    /**
     * Add a region user to accessing the region
     * @param regionUser region user instance
     * @return
     */
    @CheckReturnValue
    default Region addRegionUser(RegionUser regionUser) {
        return this;
    }

    /**
     * Remove a region user from accessing the region
     * @param regionUser region user instance
     * @return
     */
    @CheckReturnValue
    default Region removeRegionUser(RegionUser regionUser) {
        return this;
    }

    /**
     * Get the area of the region
     * @return
     */
    Area getArea();

    /**
     * Set the area of the region
     * @param area area as area-object
     * @return
     */
    @CheckReturnValue
    default Region setArea(Area area) {
        return this;
    }

    /**
     * Kick a specific user out of the region
     * @param onlineUser online user
     * @param target target location after kick
     */
    void kickUser(OnlineUser onlineUser, Location target);

    /**
     * Kick all users out of the region
     * @param target target location after kick
     */
    void kickAllUsers(Location target);

    /**
     * Reload the region data and replace the current region-object
     * @return
     */
    default Region refresh() {
        return this;
    }

    void update();
}
