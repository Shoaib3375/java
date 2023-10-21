package com.example.helloworld.DateTime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        ZoneOffset easternTimeZoneOffSet = ZoneOffset.of("-05:00");
        System.out.println("easternTimeZoneOffSet = " + easternTimeZoneOffSet);
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("defaultZoneId = " + defaultZoneId);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : availableZoneIds){
            System.out.println(zoneId);
        }
    }
}
