package com.cydeo;

public class SNode<T> { //generic type node
    public T value;
    SNode next;

    public SNode(T value) {
        this.value = value;
    }
}
