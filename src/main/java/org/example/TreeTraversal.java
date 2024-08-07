package org.example;


public class TreeTraversal {

    public static void main(String[] args) {
        Tree root = new Tree(7);
//                           7
//              3                         11
//        1           5            9               13
//     0     2     4     6      8     10       12      14


        //////////////left/////////////////////////
        root.left = new Tree(3);
        root.left.left = new Tree(1);
        root.left.left.left = new Tree(0);
        root.left.left.right = new Tree(2);
        root.left.right = new Tree(5);
        root.left.right.left = new Tree(4);
        root.left.right.right = new Tree(6);
        ///////////////right///////////////////////
        root.right = new Tree(11);
        root.right.left = new Tree(9);
        root.right.left.left = new Tree(8);
        root.right.left.right = new Tree(10);
        root.right.right = new Tree(13);
        root.right.right.left = new Tree(12);
        root.right.right.right = new Tree(14);

        System.out.print("PRE-ORDER TRAVERSAL   : ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("IN-ORDER TRAVERSAL    : ");
        inOrderTraversal(root);
        System.out.println();
        System.out.print("POST-ORDER TRAVERSAL  : ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("LEFT VIEW TRAVERSAL   : ");
        leftViewTraversal(root);
        System.out.println();
        System.out.print("RIGHT VIEW TRAVERSAL  : ");
        rightViewTraversal(root);


    }

    public static void preOrderTraversal(Tree root) {
        if(root==null){
            return;
        }
        System.out.print( root.val);
        if(root.left!=null){
            System.out.print(" -> ");
            preOrderTraversal(root.left);
        }
        if(root.right!=null){
            System.out.print(" -> ");
            preOrderTraversal(root.right);
        }
    }

    public static void inOrderTraversal(Tree root) {
        if(root==null){
            return;
        }
        if(root.left!=null){
            inOrderTraversal(root.left);
            System.out.print(" -> ");
        }

        System.out.print(root.val);
        if(root.right!=null){
            System.out.print(" -> ");
            inOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(Tree root) {
        if(root==null){
            return;
        }

        if(root.left!=null){
            postOrderTraversal(root.left);
            System.out.print(" -> ");
        }
        if(root.right!=null){

            postOrderTraversal(root.right);
            System.out.print(" -> ");
        }
        System.out.print(root.val);
    }

    public static void leftViewTraversal(Tree root) {
        if(root==null){
            return;
        }
        System.out.print(root.val);
        if(root.left!=null){
            System.out.print(" -> ");
            leftViewTraversal(root.left);
        }
    }

    public static void rightViewTraversal(Tree root) {
        if(root==null){
            return;
        }
        System.out.print(root.val);
        if(root.right!=null){
            System.out.print(" -> ");
            rightViewTraversal(root.right);
        }
    }

    public static void ViewTraversal(Tree root) {
        if(root==null){
            return;
        }
        System.out.print(root.val);
        if(root.right!=null){
            System.out.print(" -> ");
            rightViewTraversal(root.right);
        }
    }
}
