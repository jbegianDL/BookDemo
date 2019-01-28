package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library myLibrary = new Library();
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        String lineBreak = "\n";
        String prompt = "Choose what you'd like to do: " + lineBreak + "1 - Number of Books in Library" +
                lineBreak + "2 - Add a Book" + lineBreak + "3 - Print Library" + lineBreak + "4 - Search Library" +
                lineBreak + "5 - Delete a Book" + lineBreak + "6 - Exit";

//        myLibrary.getNumberOfBooks(); <-- Prints number of books
//        myLibrary.addBook(); <-- adds a book
//        myLibrary.printLibrary(); <-- prints library

        do{
            System.out.println(prompt);
            int usrChoice = input.nextInt();

            switch (usrChoice){
                case 1:
                    System.out.println("Number of books: " + myLibrary.getNumberOfBooks());
                    break;
                case 2:
                    myLibrary.addBook();
                    break;
                case 3:
                    myLibrary.printLibrary();
                    break;
                case 4:
                    myLibrary.searchLibrary();
                    break;
                case 5:
                    myLibrary.deleteBook();
                    break;
                case 6:
                    System.out.println("Goodbye");
                    repeat = false;
                    break;
                default:
                    System.out.println("Error - Incorrect input" + lineBreak + "Please try again...");
            }

        }while(repeat);



    }
}
