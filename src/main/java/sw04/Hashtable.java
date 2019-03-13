package main.java.sw04;

public class Hashtable implements IHashtable{

    private char[] mData;
    private int mSize;

    public Hashtable() {
        this.mData = new char[10];
        this.mSize = 10;
        for (int i = 0; i < 10; i++) {
            mData[i] = '-';
        }
    }

    public Hashtable(int pSize) {
        this.mData = new char[pSize];
        this.mSize = pSize;
        for (int i = 0; i < pSize; i++) {
            mData[i] = '-';
        }
    }

    public char[] getData() { return mData; }

    public int getSize() { return mSize; }

    @Override
    public void insert(char data) {
        int index = Math.abs(Character.hashCode(data));
        mData[index % mSize] = data;
    }

    @Override
    public char search(char index) {
        char data = 0;
        int it = Math.abs(Character.hashCode(index));
        for (int i = 0; i < mSize; i++) {
            data = mData[it % mSize];
        }
        return data;
    }

    @Override
    public char remove(char index) {
        char toRemove = search(index);
        mData[getIndexOf(index)] = '-';
        return toRemove;
    }


    @Override
    public String toString() {
        String representation = "[ ";
        for (int i = 0; i < mSize; i++) {
            representation +=  mData[i % mSize] + " ";
        }
        return  representation + " ]";
    }

    public int getIndexOf(char data) {
        return Math.abs(Character.hashCode(data) % this.mSize);
    }

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.insert('a');
        System.out.println(ht.getIndexOf('a'));
        ht.insert('B');
        ht.insert('z');
        ht.insert('y');
        ht.insert('x');
        ht.remove('a');
        ht.remove('B');
        System.out.println(ht.getIndexOf('B'));
        System.out.println(ht.toString());
    }
}
