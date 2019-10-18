package com.esliceu.model;

public class Game {
    int turn;
    boolean playerTurn;

    public Game(int turn, boolean playerTurn) {
        this.turn = turn;
        this.playerTurn = playerTurn;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
}
