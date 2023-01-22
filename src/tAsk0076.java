import java.util.Scanner;

public class tAsk0076 {
    public static void main(String[] args) {
          /*
Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array

Example:

Please enter day 1 of the week*/

        String day[] = { "Sunday", "Monday", " Tuesday", " Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i <= 7; i++) {

            Scanner arr = new Scanner(System.in);
            System.out.println(" Please enter day "+i+  " of the week  ");
              String lname = arr.nextLine();
        }














}}
