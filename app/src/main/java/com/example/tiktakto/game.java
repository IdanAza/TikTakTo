package com.example.tiktakto;


public class game {
    private int[][] board;
    private int count_moves;
    private int[] last_move;

    public game() {
        this.board = new int[3][3];
        for (int i = 0; i < this.board[0].length; i++) {
            for (int j = 0; j < this.board[1].length; j++) {
                this.board[i][j]=0;
            }
        }
        this.count_moves = 0;
        this.last_move = new int[2];
        last_move[0] = 0; last_move[1] = 0;

    }

    public boolean is_empty(int x, int y) {
        return board[x][y] == 0;
    }

    public boolean make_move(int x, int y) {
        if (is_empty(x, y)) {
            board[x][y] = (count_moves % 2) + 1;
            count_moves++;
            last_move[0] = x; last_move[1] = y;
            return true;
        }
        return false;
    }

    public boolean check_win(){


    }
}
