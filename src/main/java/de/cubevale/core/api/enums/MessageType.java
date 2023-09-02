package de.cubevale.core.api.enums;

public enum MessageType {

    SUCCESS("Success: "),
    ERROR("Error: "),
    WARNING("Warning: "),
    INFO("Info: "),
    DEFAULT("");

    private final String prefix;

    MessageType(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }
}
