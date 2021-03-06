package com.bridgeLabz;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class JunitUserRegistrationTest {

    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.firstName("Nadeem");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.firstName("NadeemS");
        assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.lastName("Shaikh");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.lastName("ShaiKH");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.emailId("nadeemshaikh1171998@gmail.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.emailId("nadeem.shaikh117.@gmail.com");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.mobileNumber("91 9989774456");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.mobileNumber("919989774456");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule1("qwgthjkdl");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule1("jnsdsjRcvc");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenPasswordRule2_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule2("qwgthRLjkdl");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule2_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule2("jnsdjcvcp");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenPasswordRule3_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule3("qw98hRLkdl");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule3_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule3("jnsdjcvcp");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenPasswordRule4_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule4("qw98hRL@&dl");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule4_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule4("jsdjcvcp");
        assertEquals(false, actualResult);
    }
}

