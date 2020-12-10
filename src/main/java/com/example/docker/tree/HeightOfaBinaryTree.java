package com.example.docker.tree;

public class HeightOfaBinaryTree {

    public static void main(String[] args) {
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

        final int height = height(root);
        System.out.println("height of given tree is : "+ height);

    }

    private static int height(TreeNode treeNode) {
        int x;
        int y;

        if (treeNode != null) {
            x = height(treeNode.leftChild);
            y = height(treeNode.rightChild);

            if (x > y) {
                return x + 1;
            } else {
                return y + 1;
            }
        }
        return 0;
    }
}
