package de.cubevale.core.api.command;

import de.cubevale.core.api.User;

import java.util.Objects;

public abstract class Command {

    private final CommandOptions commandOptions;

    public Command() {
        this.commandOptions = Objects.requireNonNull(
                getClass().getAnnotation(CommandOptions.class), "CommandOptions annotation is missing!");
    }

    public abstract boolean onCommand(User sender, String[] args);

    public CommandOptions getCommandOptions() {
        return commandOptions;
    }
}
