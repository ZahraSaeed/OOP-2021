package com.company;
import java.util.Scanner;

public class L8AS1Runner {
    public static void main(String[] args) {
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to XYZ Publication");
        String[] s = {"Press 1,If you are looking for books.", "Press 2,If you are looking for an audio cassette.",
                "Press 0,to return to main menu.Thank you *_*"};
        System.out.println("Choose an option\n" + s[0] + s[1] + s[2]);
        selection = input.nextInt();
        while (selection >= 1 && selection < s.length) {

            if (selection== 1) {
                System.out.println("Enter book title,price and page count:");
                Book b1 = new Book(input.next(), input.nextDouble(), input.nextInt());
                b1.display();
            }
            else if (selection == 2) {
                System.out.println("Enter audio cassette's title,price and playing time:");
                Tape t1 = new Tape(input.next(), input.nextDouble(), input.next());
                t1.display();
            }
            else if(selection == 0) {
                System.out.println("Thanks for visiting XYZ Publication.");
            }
            System.out.println(s[0] + s[1] + s[2]);
            selection = input.nextInt();
        }
    }
}
