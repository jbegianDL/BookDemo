package com.company;

public class Main {

    public static void main(String[] args) {
        Library myLibrary = new Library();

        System.out.println("Open space on shelf is at: " + myLibrary.getShelfSpot());
        myLibrary.addBook();
    }
}
