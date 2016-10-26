/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit4;

/**
 *
 * @author Robyn
 */
import java.util.*;

public class ExtraCredit4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        //list specifies value for each element     
        int[] c = {12, 24, 36, 48, 60, 72, 84, 96, 108};
        int counter;
        System.out.printf("%s%8s%n", "Index ", "Value");
        for (counter = 1; counter < c.length; counter++) {
            System.out.printf("%5d%8d%n", counter, c[counter]);
        }
        //assign a room
        int roomNumber;
        int guest[] = new int[11];
        String reply = ("y");

        for (roomNumber = 1; roomNumber < 10; roomNumber++) {
            guest[roomNumber] = 1;
            System.out.println("What room do you want?");
            roomNumber = key.nextInt();
            System.out.println("How many guests?");
            int guestNumber = key.nextInt();
            guest[roomNumber] = guestNumber;
            System.out.println("Anymore guest to check in?");

            reply = key.next();
            if (reply.equalsIgnoreCase("y")) {
                return;
            } else {
                System.out.println("Goodbye!");
                break;
            } //else4
        }//for
    } //main
}//class
