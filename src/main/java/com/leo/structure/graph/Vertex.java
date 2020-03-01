package com.leo.structure.graph;

/**
 * 顶点
 */
public class Vertex {

    // 顶点值
    private int value;

    public Vertex(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Vertex setValue(int value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
