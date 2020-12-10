package com.example.docker.tree;

import java.util.Stack;

public class IterativePreOrder {

    public static void main(String[] args) {
        IterativePreOrder iterativePreOrder = new IterativePreOrder();
        TreeNode root = new TreeNode(8);
        TreeNode secondNode = new TreeNode(3);
        TreeNode thirdNode = new TreeNode(5);
        TreeNode fourthNode = new TreeNode(4);
        TreeNode fifthNode = new TreeNode(9);
        TreeNode sixthNode = new TreeNode(7);
        TreeNode seventhNode = new TreeNode(2);


        root.leftChild = secondNode;
        root.rightChild = thirdNode;
        secondNode.leftChild = fourthNode;
        secondNode.rightChild = fifthNode;
        thirdNode.leftChild = sixthNode;
        thirdNode.rightChild = seventhNode;

        System.out.println("printing preorder traversal of tree");
        iterativePreOrder.preOrder(root);

        System.out.println();
        System.out.println("printing preorder traversal of tree");
        iterativePreOrder.inOrder(root);
    }

    private void inOrder(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();

        while (treeNode != null || !stack.isEmpty()) {

            if (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            } else {
                final TreeNode popTreeNode = stack.pop();
                System.out.print(popTreeNode.data + " ");
                treeNode = popTreeNode.rightChild;
            }
        }
    }

    private void preOrder(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();

        while (treeNode != null || !stack.isEmpty()) {
            if (treeNode != null) {
                System.out.print(treeNode.data + " ");
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            } else {
                final TreeNode popTreeNode = stack.pop();
                treeNode = popTreeNode.rightChild;
            }
        }
    }
}
