package com.example.docker.tree;

public class CountLeafNodes {

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

        final int i = countLeafNodes(root);
        System.out.println("number of leaf nodes in the tree are : " + i);
    }

    private static int countLeafNodes(TreeNode treeNode) {
        int x;
        int y;

        if (treeNode != null) {
            x = countLeafNodes(treeNode.leftChild);
            y = countLeafNodes(treeNode.rightChild);

            if (treeNode.leftChild == null && treeNode.rightChild == null) {
                return x + y + 1;
            } else {
                return x + y;
            }
        }
        return 0;
    }
}
