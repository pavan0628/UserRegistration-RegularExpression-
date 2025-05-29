package com.brlab.regx;

import java.util.Scanner;

public class User {

    //Method to validate first name
    public static boolean validateFirstName(String firstName)
    {
        return firstName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //Method to validate second name
    public static boolean validateLastName(String lastName)
    {
        return lastName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //Method to validate email
    public static  boolean validateEmail(String email)
    {
        return  email.matches("^[a-zA-Z0-9]+([._+-]+[a-zA-Z0-9])?@[a-zA-Z0-9]+[a-zA-Z0-9]+\\.[a-z]{2,4}(\\.[a-z]{2,})?$");
        //return email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
        //return email.matches("^[a-zA-Z0-9]+([._%+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$");
    }

    //Method to validate mobile number
//    public static boolean validateMobileNumber(String mobileNumber)
//    {
//        return mobileNumber.matches("^[0-9]{2,}\\s[0-9]{10}");
//    }

    //Method to validate password as per Rule-1
    public static boolean validatePasswordRuleOne(String passwordRuleOne)
    {
        return passwordRuleOne.matches("^[^\\s]{8,}");
    }

    //Method to validate password as per Rule-2
    public static boolean validateRuleTwo(String passwordRuleTwo)
    {
        return passwordRuleTwo.matches("^(?=.*[A-Z])[^\\s]{8,}$");
    }


    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter First Name");
//        String firstName=scanner.nextLine();
//        System.out.println("First name having First character Upper and having minium 3 character "+validateFirstName(firstName));

//        System.out.println("Enter last Name");
//        String lastName=scanner.nextLine();
//        System.out.println("Second name having First character Upper and having minium 3 character "+validateSecondName(lastName));

//        System.out.println("Enter email");
//        String email=scanner.nextLine();
//        System.out.println("Email validate "+validateEmail(email));
//        System.out.println("Enter mobile number");
//        String mobileNUmber=scanner.nextLine();
//        System.out.println("mobile number validate "+validateMobileNumber(mobileNUmber));
//        System.out.println("Enter the password");
//        String password=scanner.nextLine();
//        System.out.println("Password validate"+validatePasswordRuleOne(password));
        System.out.println("Enter password");
        String passwordRuleTwo=scanner.nextLine();
        System.out.println("password validate "+validateRuleTwo(passwordRuleTwo));

    }
}
