package de.cubevale.core.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleOptions {

    String name();
    String version();
    String[] authors();
    String description();

    int priority() default 0;
}
