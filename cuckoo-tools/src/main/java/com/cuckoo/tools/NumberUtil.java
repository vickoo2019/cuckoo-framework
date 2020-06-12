package com.cuckoo.tools;

public class NumberUtil {

    /**
     * @param number
     * @return
     */
    public static Boolean isOdd(Integer number) {
        if (0 == number % 2) {
            return false;
        } else {
            return true;
        }
    }
}
