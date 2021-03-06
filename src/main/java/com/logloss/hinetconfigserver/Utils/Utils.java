package com.logloss.hinetconfigserver.Utils;

public class Utils {

    private static String getRandomString(int length) {

        String KeyString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuffer sb = new StringBuffer();
        int len = KeyString.length();
        for (int i = 0; i < length; i++) {
            sb.append(KeyString.charAt((int) Math.round(Math.random() * (len - 1))));
        }
        return sb.toString();
    }

    public static String generateRandomId() {
        return getRandomString(12);
    }

    public static Long getCurrentTime() {
        return System.currentTimeMillis();

    }
}
