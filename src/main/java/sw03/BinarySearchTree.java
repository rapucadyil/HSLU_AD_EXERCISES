package main.java.sw03;

public class BinarySearchTree {

    public BSTNode mRoot;

    public BinarySearchTree() {
        mRoot = null;
    }


    public void insert(int dat) {
        BSTNode node = new BSTNode(dat);

        if (mRoot == null){
            mRoot = node;
            return;
        }
        BSTNode current = mRoot;
        BSTNode parent = null;
        while(true) {
            parent = current;
            if (dat > current.getData()) {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(node);
                    return;
                }
            }else{
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(node);
                    return;
                }
            }
        }

    }

}
