package de.cubevale.core.api.events;

import de.cubevale.core.api.event.Event;

public class ChatInputEvent extends Event {

    private final String inputKey;
    private final String inputValue;

    public ChatInputEvent(String inputKey, String inputValue) {
        this.inputKey = inputKey;
        this.inputValue = inputValue;
    }

    public String getInputKey() {
        return inputKey;
    }

    public String getInputValue() {
        return inputValue;
    }
}
