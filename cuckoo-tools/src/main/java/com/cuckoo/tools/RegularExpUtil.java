package com.cuckoo.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jasper
 * @Date 2019/05/11 23:51
 */
public class RegularExpUtil {


    public static final String MOBILE_PHONE_NO_REX = "0?(13|14|15|18|17)[0-9]{9}";

    public static final String IP_ADDESS_REX = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    public static Boolean isMobilePhone(String phoneNum) {
        Pattern pattern = Pattern.compile(MOBILE_PHONE_NO_REX);
        Matcher matcher = pattern.matcher(phoneNum);
        return matcher.matches();
    }

    public static Boolean isIpAddress(String ipAddress) {
        Pattern pattern = Pattern.compile(IP_ADDESS_REX);
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }
}
