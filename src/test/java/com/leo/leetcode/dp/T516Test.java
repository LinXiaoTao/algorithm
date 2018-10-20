package com.leo.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T516Test {

    @Test
    public void longestPalindromeSubseq() {
        T516 t516 = new T516();
        Assert.assertEquals(
                4,
                t516.longestPalindromeSubseq("bbbab")
        );
        Assert.assertEquals(
                2,
                t516.longestPalindromeSubseq("cbbd")
        );
        Assert.assertEquals(
                5,
                t516.longestPalindromeSubseq("aabaa")
        );
        Assert.assertEquals(
                159,
                t516.longestPalindromeSubseq("euazbipzncptldueeuechubrcourfpftcebikrxhybkymimgvldiwqvkszfycvqyvtiwfckexmowcxztkfyzqovbtmzpxojfofbvwnncajvrvdbvjhcrameamcfmcoxryjukhpljwszknhiypvyskmsujkuggpztltpgoczafmfelahqwjbhxtjmebnymdyxoeodqmvkxittxjnlltmoobsgzdfhismogqfpfhvqnxeuosjqqalvwhsidgiavcatjjgeztrjuoixxxoznklcxolgpuktirmduxdywwlbikaqkqajzbsjvdgjcnbtfksqhquiwnwflkldgdrqrnwmshdpykicozfowmumzeuznolmgjlltypyufpzjpuvucmesnnrwppheizkapovoloneaxpfinaontwtdqsdvzmqlgkdxlbeguackbdkftzbnynmcejtwudocemcfnuzbttcoew")
        );
    }
}