package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class T712Test {

    @Test
    public void minimumDeleteSum() {
        T712 t712 = new T712();
        Assert.assertEquals(
                231,
                t712.minimumDeleteSum("sea", "eat")
        );
        Assert.assertEquals(
                403,
                t712.minimumDeleteSum("delete", "leet")
        );
        Assert.assertEquals(
                38458,
                t712.minimumDeleteSum("rywrvsasdjbgboxrxokzsiqoicqrbnhxccwutfgpnxiqznpweilzdewoqvkxhrqwqfgewomyskoowramozwgpuoejxdtbvmwtfwcaouqqinmrcmiwjftvuvkbztvbhyzpstgugsxtmhbxpamtfzatjoruntkpocdnyvhxprwhfhsbqvrevxmxrvuehyhodugvtvgekdlihecbiqqfytlgrbrmgmylatcoywfhsvinjmndkwveazxhxzoizswsdohhqucllygoqrfwlzefbepguhwpzgxluaikyxykzpjqopzlhzatrnqufpix",
                        "myeludeuhdwnjdklqclvikveaqmwqnnrycnokagfgqnytkmrxmyyrmixhjdktmvrzpnypafscqrjuhsacsjvxynujpkvwgxobftujuzcczqbtupfdsamdyriqbwarpxnatfhkgokdyjhvskkjomcxovfkgithpxzjyauvgdbxdwdnyxygplphlm")
        );
    }
}