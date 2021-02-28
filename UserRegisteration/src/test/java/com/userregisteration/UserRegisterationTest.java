package com.userregisteration;
//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import userregisteration.UserRegisteration;
import userregisteration.UserRegistrationException;

public class UserRegisterationTest {
    UserRegisteration userRegisteration = new UserRegisteration();

    //Testcase for FirstName Validation.
    @Test
    public void name_WhenInvalid_ShouldThrowException() throws UserRegistrationException {
        boolean check = userRegisteration.validateName("Jaspreet");
        Assertions.assertEquals(true, check);
    }

    //Testcase for email validity.
    @Test
    public void email_Invalid_ShouldThrowException() throws UserRegistrationException{
        boolean check = userRegisteration.validateEmail("jas@gmail.com");
        Assertions.assertEquals(true, check);
    }

    //Testcase for invalid mobileNo.
    @Test
    public void mobileNo_Invalid_ShouldThrowException() throws UserRegistrationException {
        boolean check = userRegisteration.validatePhoneNo("91 9874441110");
        Assertions.assertEquals(true, check);
    }

    //Testcase for invalid password.
    @Test
    public void password_WhenInvalid_ShouldReturnFalse() throws UserRegistrationException{
        boolean check = userRegisteration.validatePassword("Jas1@1l");
        Assertions.assertEquals(true, check);
    }
}