package com.example.demo.question.minesweeper;

import java.util.Random;

public class Minesweeper {

    int x;
    int y;
    int mineCount;
    Cell[][] cells;

    int[][] nearCells = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public Minesweeper(int x, int y, int mineCount) {
        this.x = x;
        this.y = y;
        this.mineCount = mineCount;
        this.cells = new Cell[x][y];
    }

    static class Cell {

        int number;
        boolean mine;

        public Cell(int number, boolean mine) {
            this.number = number;
            this.mine = mine;
        }

        @Override
        public String toString() {
            return mine ? "*" : String.valueOf(number);
        }
    }

    void init() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cells[i][j] = new Cell(0, false);
            }
        }

        setUp();
    }

    void setUp() {
        Random random = new Random();

        int temp = mineCount;
        while (temp > 0) {
            temp--;

            int x = random.nextInt(this.x);
            int y = random.nextInt(this.y);

            if (cells[x][y].mine) {
                temp++;
            } else {
                cells[x][y].mine = true;
            }
        }
    }

    void print() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Cell cell = cells[i][j];
                System.out.print("[" + cell + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    /**
     * x-1,y-1 - x-1,y - x-1,y+1
     * x,y-1      *      x,y+1
     * x+1,y-1 - x+1,y - x+1,y+1
     */

    void open() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Cell cell = cells[i][j];

                if (cell.mine) {
                    for (int[] nCell : nearCells) {
                        int nx = nCell[0] + i;
                        int ny = nCell[1] + j;

                        if (nx > 0 && ny > 0 && x > nx && y > ny) {
                            cells[nx][ny].number++;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper(10, 10, 10);
        minesweeper.init();
        minesweeper.print();
        minesweeper.open();
        minesweeper.print();
    }
}
