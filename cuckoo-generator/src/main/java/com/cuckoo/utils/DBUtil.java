package com.cuckoo.utils;

import com.cuckoo.core.Constant;

public class DBUtil {
    static {
        try {
            Class.forName(Constant.driver);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
