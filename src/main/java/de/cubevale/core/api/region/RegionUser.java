package de.cubevale.core.api.region;

import de.cubevale.core.api.user.User;

import javax.annotation.CheckReturnValue;
import java.util.List;

public interface RegionUser {

    User getUser();

    List<RegionUser.RegionUserPermission> getPermissions();

    boolean hasPermission(RegionUser.RegionUserPermission permission);

    @CheckReturnValue
    default RegionUser grantPermission(RegionUser.RegionUserPermission permission) {
        return this;
    }

    @CheckReturnValue
    default RegionUser revokePermission(RegionUser.RegionUserPermission permission) {
        return this;
    }

    void update();

    enum RegionUserPermission {
        CAN_BUILD("can_build"),
        ADD_USER("add_user"),
        REMOVE_USER("remove_user");

        private final String permission;

        RegionUserPermission(String permission) {
            this.permission = permission;
        }

        public String getPermission() {
            return permission;
        }
    }
}
