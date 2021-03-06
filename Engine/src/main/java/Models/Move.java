/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 * Its a record of a move played (Or attempted to be played)
 * @author wcook
 */
public class Move {

    private int startX;
    private int startY;
    private boolean horizontal;
    private Tile[] word;
    private User user;
    private ArrayList<Move> offshootMoves;

    public Move(int startX, int startY, boolean horizontal, Tile[] word, User user) {
        this.user = user;
        this.startX = startX;
        this.startY = startY;
        this.horizontal = horizontal;
        this.word = word;
        this.user = user;
        offshootMoves = null;
    }

    /**
     * @return the startX
     */
    public int getStartX() {
        return startX;
    }

    /**
     * @return the startY
     */
    public int getStartY() {
        return startY;
    }

    /**
     * @return the horizontal
     */
    public boolean isHorizontal() {
        return horizontal;
    }

    /**
     * @return the word as a String
     */
    public String getWordString() {
        String wordString = "";
        for (Tile t : word)
            wordString += t.getLetter();
        return wordString;
    }
    
    /**
     * @return the word
     */
    public Tile[] getWord() {
        return word;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param word the word to set
     * @param word that it is set to
     */
    public Tile[] setWord(Tile[] word) {
        this.word = word;
        return word;
    }

    /**
     * @param offshootMoves the new words created off of the main word played
     */
    public void setOffshootMoves(ArrayList<Move> offshootMoves){
        this.offshootMoves = offshootMoves;
    }

    /**
     * @return offshootMoves the list of offshootMoves for the move
     */
    public ArrayList<Move> getOffshootMoves(){
        return this.offshootMoves;
    }

    public void updateStartCoordinate(int start[]){
        this.startX = start[0];
        this.startY = start[1];
    }

}
