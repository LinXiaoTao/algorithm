package com.leo.leetcode.string;

/**
 * 1108. IP 地址无效化
 * https://leetcode-cn.com/problems/defanging-an-ip-address/
 */
public class T1108 {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

}
