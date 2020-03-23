package com.leo.offer;

public class T5 {

    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        return s.replace(" ", "%20");
    }
}
