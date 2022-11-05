package com.greatLearning.mnctransaction;

public class TransactionTree {

    public BSTNode root;

    public BSTNode prev;

    public BSTNode head;

    public BSTNode getRoot() {
        return root;
    }

    public void setRoot(BSTNode root) {
        this.root = root;
    }

    public BSTNode getHead() {
        return head;
    }

    public void constructLeftSkewedTransactionTree(BSTNode root) {

        if (root == null) return;

        constructLeftSkewedTransactionTree(root.getLeft());
        BSTNode rightNode = root.getRight();

        if (head == null) {
            head = root;
            root.setLeft(null);
            prev = root;
        } else {
            prev.setRight(root);
            root.setLeft(null);
            prev = root;
        }

        constructLeftSkewedTransactionTree(rightNode);
    }

    public void traverseSkewedTransactionTree(BSTNode root)
    {
        if(root == null) return;

        System.out.print(root.getData() + " ");
        traverseSkewedTransactionTree(root.getRight());
    }
}
