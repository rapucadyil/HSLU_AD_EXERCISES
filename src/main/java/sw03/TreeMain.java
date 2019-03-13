package main.java.sw03;

public class TreeMain {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(10);
        bst.insert(3);
        bst.insert(2);
        bst.insert(25);


        System.out.println(bst.mRoot.getData());
        System.out.println(bst.mRoot.getRight().getData());
        System.out.println(bst.mRoot.getRight().getRight().getData());
        System.out.println(bst.mRoot.getLeft().getData());
        System.out.println(bst.mRoot.getLeft().getLeft().getData());
    }


}
