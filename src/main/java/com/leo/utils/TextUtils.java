package com.leo.utils;

public final class TextUtils {

    private TextUtils() {

    }

    /**
     * 文本是否为空
     *
     * @param text 文本
     * @return 是否为空
     */
    public static boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }

    /**
     * 两个文本是否相同
     *
     * @param text1 文本1
     * @param text2 文本2
     * @return 如果两个文本其中一个为空，或者两个都为空，返回 false
     */
    public static boolean equals(String text1, String text2) {
        if (text1 == null || text2 == null) {
            return false;
        }
        return text1.equals(text2);
    }

}
