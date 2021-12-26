/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author saum
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiating objects and variables
        Scanner myScanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        boolean cont = true;
        
        //cont means continue
        while (cont) {

            System.out.println("Enter any digit or character");
            list.addNode(myScanner.next());
            System.out.println("Continue Y/N");
            if (myScanner.next().equalsIgnoreCase("n")) {//by saying no, the variable cont is false and the loop will not be iterated
                cont = false;
            }

        }
        
        //setting up variables
        String sort = list.toString();
        int stringSize = sort.length();
        String digits = "";
        String letters = "";

        //looping through the string output of the list
        for (int i = 0; i < stringSize; i++) {
            //checking whether the character is a digit or not
            if (Character.isDigit(sort.charAt(i))) {
                digits += sort.charAt(i);
            } else {
                letters += sort.charAt(i);
            }
        }
        
        //concatenating two string together in the order of digits first then char
        sort = digits + letters;
        
        //outputting the final sorted answer
        System.out.println("Sorted list: " + sort);

    }

}
