package de.cubevale.core.api.command;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CommandOptions {

    String name();
    String permission() default "*";
    String[] aliases() default {};

    boolean hidden() default false;
}
