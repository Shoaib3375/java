package com.example.helloworld.DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneIdOffsetPrinter {
    public static void main(String[] args) {
        LocalDateTime now  = LocalDateTime.now();

        for (String zoneId : ZoneId.getAvailableZoneIds()){
            ZoneId id = ZoneId.of(zoneId);
            ZonedDateTime zonedDateTime = now.atZone(id);
            ZoneOffset zoneOffset = zonedDateTime.getOffset();
            String offset = zoneOffset.getId().replaceAll("Z","+00:00");
            System.out.printf("%35s (UTC%s) %n", id, offset);
        }

    }
}
