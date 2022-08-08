package org.example;

public class Square {

    private int rusuk;
    private int sisi;
    public Square(int rusuk, int sisi){

        this.rusuk = rusuk;
        this.sisi = sisi;
    }
    public int getLuas(){
        return this.rusuk*this.sisi;
    }
}
