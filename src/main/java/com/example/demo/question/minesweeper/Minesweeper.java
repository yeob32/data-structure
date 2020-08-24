package com.example.demo.question.minesweeper;

import java.util.*;

public class Minesweeper {

    int x;
    int y;
    int mineCount;
    Cell[][] cells;

    public Minesweeper(int x, int y, int mineCount) {
        this.x = x;
        this.y = y;
        this.mineCount = mineCount;
        this.cells = new Cell[x][y];
    }

    static class Cell {

        int number;
        boolean mine;
        List<Cell> nearCells;

        public Cell(int number, boolean mine) {
            this.number = number;
            this.mine = mine;
            this.nearCells = new ArrayList<>();
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

        shuffle();
    }

    void shuffle() {
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
    }

    void open() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Cell cell = cells[i][j];


                // x-1,y-1 - x-1,y - x-1,y+1
                // x,y-1             x,y+1
                // x+1,y-1 - x+1,y - x+1,y+1



                if(cell.mine) {
                    if(i > 0) {
                        cell.nearCells.add(cells[i-1][j-1]);
                        cell.nearCells.add(cells[i-1][j]);
                        if(j < y) {
                            cell.nearCells.add(cells[i-1][j+1]);
                        }
                    }

                    if(j > 0) {
                        cell.nearCells.add(cells[i][j-1]);
                        cell.nearCells.add(cells[i+1][j-1]);
                    }

                    cell.nearCells.add(cells[i][j+1]);
                    cell.nearCells.add(cells[i+1][j]);
                    cell.nearCells.add(cells[i+1][j+1]);

                    if(i > 0 && j >0) {
                        cell.nearCells.add(cells[i+1][j]);
                        cell.nearCells.add(cells[i+1][j]);
                    }



//                    cell.nearCells.add()
                }
            }
        }
    }

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper(10, 10, 2);
        minesweeper.init();
        minesweeper.print();
        minesweeper.open();
    }
}
