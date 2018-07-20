package com.leo.guide.part1;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogCatQueueTest {

    @Test
    public void testDogCatQueue() {

        DogCatQueue queue = new DogCatQueue();

        Assert.assertSame(true, queue.isEmpty());
        Assert.assertSame(true, queue.isCatEmpty());
        Assert.assertSame(true, queue.isDogEmpty());

        DogCatQueue.Cat cat1 = new DogCatQueue.Cat();

        try {
            queue.add(cat1);
        } catch (Exception e) {
            Assume.assumeNoException(e);
        }

        Assert.assertSame(false, queue.isEmpty());
        Assert.assertSame(false, queue.isCatEmpty());
        Assert.assertSame(true, queue.isDogEmpty());

        DogCatQueue.Cat cat2 = new DogCatQueue.Cat();
        try {
            queue.add(cat2);
        } catch (Exception e) {
            Assume.assumeNoException(e);
        }

        DogCatQueue.Dog dog1 = new DogCatQueue.Dog();
        try {
            queue.add(dog1);
        } catch (Exception e) {
            Assume.assumeNoException(e);
        }

        DogCatQueue.Cat cat3 = new DogCatQueue.Cat();
        try {
            queue.add(cat3);
        } catch (Exception e) {
            Assume.assumeNoException(e);
        }

        Assert.assertSame(cat1, queue.pollAll());
        Assert.assertSame(dog1, queue.pollDog());

        Assert.assertSame(false, queue.isEmpty());
        Assert.assertSame(false, queue.isCatEmpty());
        Assert.assertSame(true, queue.isDogEmpty());

        Assert.assertSame(cat2, queue.pollAll());
        Assert.assertSame(cat3, queue.pollAll());
    }

}