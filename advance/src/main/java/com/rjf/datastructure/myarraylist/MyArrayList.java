package com.rjf.datastructure.myarraylist;

public class MyArrayList implements List{

    private transient Object[] elementData;

    private int size=0;

    public MyArrayList(){
        elementData = new Object[10];
    }

    public MyArrayList(int init){
        elementData = new Object[init];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i<0 || i>=size) {
            throw new ArrayIndexOutOfBoundException("索引越界 : "+i);
        }
        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public void add(Object o) {
        if (size == elementData.length  ){
            Object[] newArray = new Object[elementData.length*2];
            for (int i=0; i<size; i++){
                newArray[i]=elementData[i];
            }
            elementData=newArray;
        }
        elementData[size]=o;
        size++;

    }

    @Override
    public boolean addBefore(Object obj1, Object obj2) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj1, Object obj2) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public Object replace(int i, Object o) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("[");
        for (int i=0; i<size; i++) {
            sb.append(elementData[i]);
            if (i<size-1){
                sb.append(",");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
