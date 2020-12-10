package com.example.docker.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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
        printLevelOrderTraversal(root);
    }

    private static void printLevelOrderTraversal(final TreeNode treeNode) {
        if (treeNode == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        System.out.print(treeNode.data + " ");
        queue.add(treeNode);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.leftChild != null) {
                System.out.print(node.leftChild.data + " ");
                queue.add(node.leftChild);
            }
            if (node.rightChild != null) {
                System.out.print(node.rightChild.data + " ");
                queue.add(node.rightChild);
            }
        }
    }

}
