package de.cubevale.core.api;

import de.cubevale.core.api.event.EventListener;
import de.cubevale.core.api.command.Command;

public abstract class Module {

    private final Core core;

    public Module(Core core) {
        this.core = core;
        new CubeVale(core);
    }

    public void onEnable() {
        // Module start logic
    }

    public void onDisable() {
        // Module stop logic
    }

    public Core getCore() {
        return core;
    }

    public void registerCommand(Command command) {
        core.registerCommand(command);
    }
    public void registerListener(EventListener eventListener) {
        core.registerListener(eventListener);
    }
}
