package de.cubevale.core.api.phone.app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneAppOptions {
    String identifier();
    String name();
    String description();
    double price();
}
