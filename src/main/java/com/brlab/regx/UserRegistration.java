package com.brlab.regx;

import java.util.Scanner;

public class UserRegistration {

    public static boolean validateFirstName(String firstName)
    {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName=scanner.nextLine();

        System.out.println("First name having First character Upper and having minium 3 character "+validateFirstName(firstName));

    }
}
