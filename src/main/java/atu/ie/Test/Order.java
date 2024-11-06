package atu.ie.Test;
import java.util.ArrayList;
import java.util.Scanner;
public class Order {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Your name");
        String name1 = sc.nextLine();
        name s1 = new name();
        s1.setname(name1);
        System.out.println("name entered: " s1.getName);

        ArrayList<String> products = new ArrayList<String>();

        products.add("Toaster");
        products.add("Phone");
        products.add("Kettle");
        products.add("Keyboard");
        products.add("Monitor");

        System.out.println("Please enter your oderId: ");
        boolean validInput = false;

        while (!validInput) {
            try {
                String Input = sc.nextLine();
                int myNum = Integer.parseInt(Input);
                if (myNum >= 0 && myNum <= 5) {
                    System.out.println("You have ordered" + products.get(0));
                    validInput = true;
                    System.out.println("There is 12 Toaster left in stock");
                } else {
                    System.out.println("You have not entered a valid orderId");
                } catch(NumberFormatException ae){
                    System.out.println("Invalid orderId. Please enter another orderId");
                }
            }

        }



    }



