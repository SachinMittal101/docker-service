package com.example.docker.binarysearchtree;

import com.example.docker.tree.TreeNode;

public class BinarySearchInTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(30);
        TreeNode secondNode = new TreeNode(20);
        TreeNode thirdNode = new TreeNode(40);
        TreeNode fourthNode = new TreeNode(10);
        TreeNode fifthNode = new TreeNode(25);
        TreeNode sixthNode = new TreeNode(35);
        TreeNode seventhNode = new TreeNode(50);

        root.leftChild = secondNode;
        root.rightChild = thirdNode;
        secondNode.leftChild = fourthNode;
        secondNode.rightChild = fifthNode;
        thirdNode.leftChild = sixthNode;
        thirdNode.rightChild = seventhNode;

        final boolean search = search(root, 35);
        if (search) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    private static boolean search(TreeNode treeNode, int key) {

        while (treeNode != null) {

            if (key == treeNode.data) {
                return true;
            } else if (key < treeNode.data) {
                treeNode = treeNode.leftChild;
            } else {
                treeNode = treeNode.rightChild;
            }
        }
        return false;
    }


}
