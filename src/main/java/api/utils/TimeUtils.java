package de.cubevale.core.api.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeUtils {

    private long currentMillis;

    public TimeUtils(long millis) {

    }

    public TimeUtils addYears(int years) {
        this.currentMillis = currentMillis + years * Long.parseLong("31536000000");
        return this;
    }

    public TimeUtils addMonths(int months) {
        this.currentMillis = currentMillis + months * Long.parseLong("2628000000");
        return this;
    }

    public TimeUtils addDays(int days) {
        this.currentMillis = currentMillis + days * Long.parseLong("86400000");
        return this;
    }

    public TimeUtils addHours(int hours) {
        this.currentMillis = currentMillis + hours * Long.parseLong("3600000");
        return this;
    }

    public TimeUtils addMinutes(int minutes) {
        this.currentMillis = currentMillis + minutes * Long.parseLong("60000");
        return this;
    }

    public TimeUtils addSeconds(int seconds) {
        this.currentMillis = currentMillis + seconds * Long.parseLong("1000");
        return this;
    }

    public TimeUtils removeYears(int years) {
        this.currentMillis = currentMillis - years * Long.parseLong("31536000000");
        return this;
    }

    public TimeUtils removeMonths(int months) {
        this.currentMillis = currentMillis - months * Long.parseLong("2628000000");
        return this;
    }

    public TimeUtils removeDays(int days) {
        this.currentMillis = currentMillis - days * Long.parseLong("86400000");
        return this;
    }

    public TimeUtils removeHours(int hours) {
        this.currentMillis = currentMillis - hours * Long.parseLong( "3600000");
        return this;
    }

    public TimeUtils removeMinutes(int minutes) {
        this.currentMillis = currentMillis - minutes * Long.parseLong("60000");
        return this;
    }

    public TimeUtils removeSeconds(int seconds) {
        this.currentMillis = currentMillis - seconds * Long.parseLong("1000");
        return this;
    }

    public long getTimeInMillis() {
        return currentMillis;
    }

    public static TimeUtils getTime(long currentMillis) {
        return new TimeUtils(currentMillis);
    }

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static String getFormattedTime(long timeMillis) {
        Instant instant = Instant.ofEpochMilli(timeMillis);
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return localDateTime.format(dateTimeFormatter);
    }
}
