package com.example.demo.structure;

import java.util.LinkedList;

/**
 * hashCode 생성 예제
 * key 문자열의 char 값을 모두 더하고 hashTable의 배열방 크기로 나눈 나머지 값을 해시코드로 사용한다.
 */
public class HashTable {

    static class Node {
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    private LinkedList<Node>[] data;

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    private int getHashCode(String key) {
        int hashCode = 0;
        for (char ch : key.toCharArray()) {
            hashCode += ch;
        }

        return hashCode;
    }

    private int convertToIndex(int hashCode) {
        return hashCode % data.length;
    }

    private Node searchKey(LinkedList<Node> list, String key) {
        if(list == null) return null;

        for(Node node : list) {
            if(node.key.equals(key)) {
                return node;
            }
        }

        return null;
    }

    public void put(String key, String value) {
        int index = convertToIndex(getHashCode(key));

        LinkedList<Node> list = data[index];
        if(list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }

        Node node = searchKey(list, key);
        if(node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.setValue(value);
        }
    }

    public String get(String key) {
        int index = convertToIndex(getHashCode(key));

        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);

        return node == null ? null : node.value;
    }

    public void remove(String key) {
        int index = convertToIndex(getHashCode(key));

        LinkedList<Node> list = data[index];
        if(list == null) return;

        list.removeLast();
    }
}
