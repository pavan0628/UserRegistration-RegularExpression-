package com.brlab.regx;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    // Happy test Cases
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

    // Sad Test Cases
    @Test
    public void testInvalidFirstName() {
        assertFalse(User.validateFirstName("jo"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(User.validateEmail("abc@.com"));
    }

    // UC11 - Parameterized Test for multiple emails
    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@abc.com.in"})
    public void testValidMultipleEmails(String email) {
        assertTrue(User.validateEmail(email));
    }



}