/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program asks the user for their age and compare it to the legal driving age of sixteen
import java.util.Scanner;
public class ex16{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
            int age = input.nextInt();
            
            if(age<0)
                System.out.println("Enter a valid age");
            else{
                String country[]={"Algeria","Canada","US", "Africa","Mexico", "Iran"};
                int valid_age[]= {18,16,16,17,15,18};
            
                for(int i=0;i<5;i++)
                    System.out.println( age>=valid_age[i] ? "Your are old enough to legally drive in " + country[i] : "Your are not old enough to legally drive " +country[i]);
            }//end of else
    }//end of main
}//end of class