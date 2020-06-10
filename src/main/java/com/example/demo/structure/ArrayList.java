package com.example.demo.structure;

public class ArrayList<T> {

    private int size = 0;
    private int p = 100;

    private Object[] datas;

    public ArrayList() {
        datas = new Object[p];
    }

    public void add(T item) {
        if (size > 0 && p / size < 2) {
            System.out.println(String.format("배열 사이즈 2배 , size: %s, p: %s, (p/size): %s", size, p, p / size));

            p *= 2;

            // System.arraycopy(datas, 0, newDatas, 0, datas.length);
            Object[] newDatas = new Object[p];
            for (int i = 0; i < datas.length; i++) {
                newDatas[i] = datas[i];
            }

            datas = newDatas;
        }

        datas[size] = item;

        size++;
    }

    public T get(int index) {
        if (size == 0 || size <= index) {
            throw new ArrayIndexOutOfBoundsException(String.format("index: %s, size: %s", index, size));
        }

        return (T) datas[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        datas[index] = null;

        Object[] newData = new Object[size - 1];
        for (int i = 0; i < size - 1; i++) {
            if(i != index) {
                newData[i] = datas[i];
            }
        }

        datas = newData;
        size--;
    }

    public boolean contains(Object item) {
        for (Object data : datas) {
            if (data == item) {
                return true;
            }
        }

        return false;
    }
}
