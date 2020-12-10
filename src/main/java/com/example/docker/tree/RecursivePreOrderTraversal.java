package com.example.docker.tree;

public class RecursivePreOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode secondNode = new TreeNode(20);
        TreeNode thirdNode = new TreeNode(30);
        TreeNode fourthNode = new TreeNode(40);

        root.leftChild = secondNode;
        root.rightChild = thirdNode;
        secondNode.leftChild = fourthNode;

        System.out.println("printing preorder traversal of tree");
        printPreOrder(root);

        System.out.println();
        System.out.println("printing inorder traversal of tree");
        inOrder(root);

        System.out.println();
        System.out.println("printing postorder traversal of tree");
        postOrder(root);

    }

    private static void postOrder(TreeNode root) {
        if(root == null)
            return;

        printPreOrder(root.leftChild);
        printPreOrder(root.rightChild);
        System.out.print(root.data + " ");
    }

    private static void inOrder(TreeNode root) {
        if(root == null)
            return;

        printPreOrder(root.leftChild);
        System.out.print(root.data + " ");
        printPreOrder(root.rightChild);
    }

    private static void printPreOrder(TreeNode root) {
        if(root == null)
            return;

        System.out.print(root.data + " ");
        printPreOrder(root.leftChild);
        printPreOrder(root.rightChild);
    }
}

