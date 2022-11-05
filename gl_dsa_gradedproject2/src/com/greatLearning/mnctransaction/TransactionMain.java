package com.greatLearning.mnctransaction;

public class TransactionMain {

    public static void main(String[] args) {

        TransactionTree tree = new TransactionTree();

        tree.setRoot(new BSTNode(50));
        tree.getRoot().setLeft(new BSTNode(30));
        tree.getRoot().setRight(new BSTNode(60));
        tree.getRoot().getLeft().setLeft(new BSTNode(10));
        tree.getRoot().getRight().setLeft(new BSTNode(55));

        tree.constructLeftSkewedTransactionTree(tree.getRoot());
        tree.traverseSkewedTransactionTree(tree.getHead());
    }
}
