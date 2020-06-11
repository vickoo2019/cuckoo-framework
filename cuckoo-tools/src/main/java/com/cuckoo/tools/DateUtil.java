package com.cuckoo.tools;

import java.util.Calendar;

public class DateUtil {

    public static String getDateString() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime().toString();
    }
}
