package com.leo.leetcode.design;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class T641Test {

    @Test
    public void test() {
        T641 t641 = new T641(5);
        Assert.assertTrue(
                t641.insertLast(2)
        );
        Assert.assertTrue(
                t641.insertLast(3)
        );
        Assert.assertFalse(
                t641.isFull()
        );
        Assert.assertTrue(
                t641.insertLast(4)
        );
        Assert.assertTrue(
                t641.insertLast(5)
        );
        Assert.assertTrue(
                t641.insertFront(1)
        );
        Assert.assertTrue(
                t641.isFull()
        );
        Assert.assertFalse(
                t641.insertLast(100)
        );
        Assert.assertEquals(
                1,
                t641.getFront()
        );
        Assert.assertEquals(
                5,
                t641.getRear()
        );
        Assert.assertTrue(
                t641.deleteFront()
        );
        Assert.assertEquals(
                2,
                t641.getFront()
        );
        Assert.assertFalse(
                t641.isFull()
        );
        Assert.assertTrue(
                t641.insertLast(6)
        );
        Assert.assertTrue(
                t641.isFull()
        );
        Assert.assertFalse(
                t641.insertFront(0)
        );
        Assert.assertEquals(
                6,
                t641.getRear()
        );
        Assert.assertTrue(
                t641.deleteLast()
        );
        Assert.assertFalse(
                t641.isFull()
        );
        Assert.assertEquals(
                5,
                t641.getRear()
        );
    }

    @Test
    public void test1(){
        T641 t641 = new T641(4);
        t641.insertFront(4);
        t641.deleteLast();
        t641.getRear();

    }



}