package com.leo.offer;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T5Test {

    @Test
    public void replaceSpace() {
        T5 t5 = new T5();
        Assert.assertEquals(
                "We%20are%20happy.",
                t5.replaceSpace("We are happy.")
        );
    }
}