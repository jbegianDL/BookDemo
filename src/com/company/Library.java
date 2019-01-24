package com.company;
import java.util.Scanner;

public class Library {
    private int shelfSpot;
    private Book [] shelf = new Book[3];

    public void addBook(){
        Book newBook = new Book();
        System.out.println("Provide Title");
        Scanner input = new Scanner(System.in);
        newBook.setTitle(input.nextLine());
        System.out.println("Provide Author");
        newBook.setAuthor(input.nextLine());
        System.out.println("Provide Genre");
        newBook.setGenre(input.nextLine());
        System.out.println("Provide Number of Pages");
        newBook.setNumberOfPages(input.nextInt());
    }

    public int getShelfSpot(){
        for(int i = 0; i < shelf.length; i++){
            if(shelf[i] == null){
                shelfSpot = i;
                break;
            }
        }
        return shelfSpot;
    }
}
