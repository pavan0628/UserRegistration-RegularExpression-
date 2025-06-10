package com.brlab.regx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
   void validateFirstNameTest(){
       assertTrue(User.validateFirstName("Vinay"));
   }

   @Test
   void validateLastNameTest(){
        assertTrue(User.validateLastName("Kalyan"));
   }

   void validateEmailTest(){
        assertTrue(User.validEmail("abc@gmail.com"));
   }

    @Test
    public void testValidMobile() {
        assertTrue(User.validateMobileNumber("91 9919819801"));
    }

    @Test
    public void testValidPassword() {
        assertTrue((User.validateRuleFour("Password@121")));
    }

}