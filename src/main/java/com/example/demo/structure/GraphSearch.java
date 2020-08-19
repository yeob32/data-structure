package com.example.demo.structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphSearch {

    static class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked;

        public Node(int data) {
            this.data = data;
            marked = false;
            adjacent = new LinkedList<>();
        }
    }

    Node[] nodes;

    public GraphSearch(int capacity) {
        nodes = new Node[capacity];
        for (int i = 0; i < capacity; i++) {
            nodes[i] = new Node(i);
        }
    }

    public void addEdge(int i1, int i2) {
        Node node1 = nodes[i1];
        Node node2 = nodes[i2];

        if (!node1.adjacent.contains(node2)) {
            node1.adjacent.add(node2);
        }

        if (!node2.adjacent.contains(node1)) {
            node2.adjacent.add(node1);
        }
    }

    public void dfs() {
        dfs(0);
    }

    public void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true;

        while(!stack.isEmpty()) {
            Node node = stack.pop();
            for(Node n : node.adjacent) {
                if(!n.marked) {
                    n.marked = true;
                    stack.push(n);
                }
            }

            visit(node);
        }
    }

    public void bfs() {
        bfs(0);
    }

    public void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        root.marked = true;

        while(!queue.isEmpty()) {
            Node node = queue.remove();
            for(Node adjacent : node.adjacent) {
                if(!adjacent.marked) {
                    adjacent.marked = true;
                    queue.offer(adjacent);
                }
            }

            visit(node);
        }
    }

    public void dfsRecursive(Node node) {
        if(node == null) return;
        node.marked = true;
        visit(node);

        for(Node n : node.adjacent) {
            if(!n.marked) {
                dfsRecursive(n);
            }
        }
    }

    public void dfsRecursive(int index) {
        Node node = nodes[index];
        dfsRecursive(node);
    }

    public void dfsRecursive() {
        dfsRecursive(0);
    }

    private void visit(Node node) {
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        GraphSearch graphSearch = new GraphSearch(9);
        graphSearch.addEdge(0, 1);
        graphSearch.addEdge(1, 2);
        graphSearch.addEdge(1, 3);
        graphSearch.addEdge(2, 4);
        graphSearch.addEdge(2, 3);
        graphSearch.addEdge(3, 4);
        graphSearch.addEdge(3, 5);
        graphSearch.addEdge(5, 6);
        graphSearch.addEdge(5, 7);
        graphSearch.addEdge(6, 8);

        graphSearch.dfsRecursive();
    }
}
