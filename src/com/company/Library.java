package com.company;
import java.util.Scanner;

public class Library {
    private Book [] shelf = new Book[3];


    public void addBook(){
        if (getNumberOfBooks() == shelf.length){
            System.out.println("No room");
        }else{
            shelf[getNumberOfBooks()] = makeBook();
        }

    }

    public Book makeBook(){
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

        return newBook;
    }

    public int getNumberOfBooks(){
        int numberOfBooks = 0;
        for(int i = 0; i < shelf.length; i++){
            if(shelf[i] == null){
                numberOfBooks = i;
                break;
            }else if (i == (shelf.length - 1)){
                numberOfBooks = shelf.length;
            }
        }
        return numberOfBooks;
    }



    public void printLibrary(){
        for(int i = 0; i < shelf.length; i++){
            if(shelf[i] != null){
                System.out.println((i + 1) + ": Title: " + shelf[i].getTitle() + " -- Author: " + shelf[i].getAuthor() + " -- Genre: " + shelf[i].getGenre() + " -- Pages: " + shelf[i].getNumberOfPages());
            }else {
                System.out.println((i + 1) + ": ");
            }

        }
    }

    public void searchLibrary(){
        String wantedBook;
        System.out.println("What is the title of the book you're looking for?");
        Scanner input = new Scanner(System.in);
        wantedBook = input.nextLine();
        for(int i = 0; i < shelf.length; i++){
            if(shelf[i] != null && wantedBook.equals(shelf[i].getTitle())){
                System.out.println("We've got it!");
                break;
            } else {
                System.out.println("We don't have the book you're looking for...");
            }
        }
    }

    public void deleteBook(){
        String notWantedBook;
        printLibrary();
        System.out.println("What book would you like to delete? \n" +
                "Please enter the title of the book: ");
        Scanner input = new Scanner(System.in);
        notWantedBook = input.nextLine();
        for(int i = 0; i < shelf.length; i++){
            if(shelf[i] != null && notWantedBook.equals(shelf[i].getTitle())){
                shelf[i] = null;
                break;
            } else {
                System.out.println("We don't have the book you're looking for...");
            }
        }


    }
}
