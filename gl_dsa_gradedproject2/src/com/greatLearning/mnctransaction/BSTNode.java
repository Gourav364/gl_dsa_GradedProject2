package com.greatLearning.mnctransaction;

public class BSTNode {

    private int data;

    private BSTNode left;

    private BSTNode right;

    public BSTNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
