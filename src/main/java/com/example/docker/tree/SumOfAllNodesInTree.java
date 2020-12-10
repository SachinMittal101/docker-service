package com.example.docker.tree;

public class SumOfAllNodesInTree {

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

        final int sum = sum(root);
        System.out.println("sum of all nodes : "+ sum);
    }

    private static int sum(TreeNode treeNode) {
        int x;
        int y;

        if(treeNode != null){
            x = sum(treeNode.leftChild);
            y = sum(treeNode.rightChild);
            return x + y + treeNode.data;
        }

        return 0;
    }
}
