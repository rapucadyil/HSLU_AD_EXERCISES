package main.java.sw03;

public class BSTNode {

    private int mData;
    private BSTNode mLeft;
    private BSTNode mRight;

    public BSTNode(int pData) {
        this.mData = pData;
        this.mLeft = null;
        this.mRight = null;
    }

    public int getData() {
        return mData;
    }

    public BSTNode getLeft() {
        return mLeft;
    }

    public void setLeft(BSTNode newLeft) {
        this.mLeft = newLeft;
    }

    public BSTNode getRight() {
        return mRight;
    }

    public void setRight(BSTNode newRight) {
        this.mRight = newRight;
    }

}
