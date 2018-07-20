package com.leo.guide.part1;

import com.leo.utils.TextUtils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目：
 * 猫狗队列
 * 要求：
 * 1. 可以调用 add 方法将 cat 或 dog 的实例放入实例
 * 2. 可以调用 pollAll 方法将队列中的所有的实例按照队列加入顺序依次弹出
 * 3. 可以调用 pollDog 方法将队列中 dog 实例按照队列加入顺序依次弹出
 * 4. 可以调用 pollCar 方法将队列中 cat 实例按照队列加入顺序依次弹出
 * 5. 可以调用 isEmpty 方法检查是否存在实例
 * 6. 可以调用 isDogEmpty 方法检查是否存在 dog 实例
 * 7. 可以调用 isCatEmpty 方法检查是否存在 cat 实例
 */
@SuppressWarnings("unused")
public class DogCatQueue {

    private final Queue<PetEntQueue> dogQueue = new LinkedList<>();
    private final Queue<PetEntQueue> catQueue = new LinkedList<>();
    // 已经添加下标
    private long count = 0;

    public void add(Pet pet) {
        if (pet == null) {
            return;
        }
        if (TextUtils.equals(pet.getType(), "dog")) {
            // dog
            dogQueue.offer(new PetEntQueue(pet, ++count));
        } else if (TextUtils.equals(pet.getType(), "cat")) {
            // cat
            catQueue.offer(new PetEntQueue(pet, ++count));
        }
    }

    public Pet pollAll() {
        if (!dogQueue.isEmpty() && !catQueue.isEmpty()) {
            if (dogQueue.peek().getCount() < catQueue.peek().getCount()) {
                return dogQueue.poll().getPet();
            } else {
                return catQueue.poll().getPet();
            }
        } else if (!dogQueue.isEmpty()) {
            return dogQueue.poll().getPet();
        } else if (!catQueue.isEmpty()) {
            return catQueue.poll().getPet();
        }
        return null;
    }

    public Dog pollDog() {
        if (!dogQueue.isEmpty()) {
            return (Dog) dogQueue.poll().getPet();
        }
        return null;
    }

    public Cat pollCat() {
        if (!catQueue.isEmpty()) {
            return (Cat) catQueue.poll().getPet();
        }
        return null;
    }

    public boolean isEmpty() {
        return catQueue.isEmpty() && dogQueue.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQueue.isEmpty();
    }

    public boolean isDogEmpty() {
        return dogQueue.isEmpty();
    }

    /**
     * 动物类
     */
    public abstract static class Pet {
        private final String type;

        public Pet(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static class Dog extends Pet {

        public Dog() {
            super("dog");
        }
    }

    public static class Cat extends Pet {

        public Cat() {
            super("cat");
        }
    }

    private static class PetEntQueue {
        private final Pet pet;
        private long count;

        public PetEntQueue(Pet pet, long count) {
            this.pet = pet;
            this.count = count;
        }

        public Pet getPet() {
            return pet;
        }

        public long getCount() {
            return count;
        }
    }


}
