package atu.ie.Test;
import java.util.ArrayList;
import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your oderId: ");
        boolean validInput = false;

        while(!validInput){
            try {
                String Input = sc.nextLine();
                int myNum = Integer.parseInt(Input);
            if(myNum >= 0&& myNum <= 3) {
                System.out.println("You have ordered" + myNum);
                validInput = true;
            }else{
                System.out.println("You have not entered a valid orderId");
            } catch(NumberFormatException ae){
                    System.out.println("Invalid orderId. Please enter another orderId");
                }
        }



        System.out.println("Please enter Your name");
        String name1 = sc.nextLine();



    }


}
