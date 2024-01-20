package de.cubevale.core.api.economy;

import de.cubevale.core.api.user.User;

import javax.annotation.CheckReturnValue;
import java.util.List;

public interface AccountUser {

    User getUser();

    List<AccountUserPermission> getPermissions();

    boolean hasPermission(AccountUserPermission permission);

    @CheckReturnValue
    default AccountUser grantPermission(AccountUserPermission permission) {
        return this;
    }

    @CheckReturnValue
    default AccountUser revokePermission(AccountUserPermission permission) {
        return this;
    }

    void update();

    enum AccountUserPermission {
        TRANSFER("transfer"),
        ADD_USER("add_user"),
        REMOVE_USER("remove_user"),
        SEE_HISTORY("see_history");

        private final String permission;

        AccountUserPermission(String permission) {
            this.permission = permission;
        }

        public String getPermission() {
            return permission;
        }
    }
}
