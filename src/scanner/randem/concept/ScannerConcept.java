package scanner.randem.concept;

import java.util.Scanner;

public class ScannerConcept {

    public static void main(String[] args) {
        String userName;
        String email;
        int password = 12345;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your UserName ");
        userName=input.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("Please enter your email ");
        email= input.nextLine();
        System.out.println("Hello " + userName + " " + email);
        System.out.println("Please enter your password ");
       // password = input.nextInt();

        if(password ==input.nextInt()){
            System.out.println("Hello " + userName + "Welcome");
        }
        else{
            System.out.println("please enter valid password ");
        }
        while(password != input.nextInt()) System.out.println("please enter valid password");
        System.out.println("Hello " + userName +" " +"Welcome");

    }
}
