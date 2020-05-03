package com.userRegister;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegisterTest {
private UserRegister userRegister;
    @Test
    public void positiveFirstNameTesting() {
        boolean condition=userRegister.checkFirstName("Milan");
        Assert.assertTrue(condition);
    }
    @Test
    public void negativeFirstNameTesting() {
        boolean condition=userRegister.checkFirstName("milan");
        Assert.assertFalse(condition);
    }
    @Test
    public void positiveLastNameTesting() {
        boolean condition=userRegister.checkLastName("Gowda");
        Assert.assertTrue(condition);
    }
    @Test
    public void negativeLastNameTesting() {
        boolean condition=userRegister.checkLastName("gowda");
        Assert.assertFalse(condition);
    }

    @Test
    public void positiveValidateEmailTesting() {
        boolean condition=userRegister.checkEmailID("milan.gowda.adb@gmail.co.in");
        Assert.assertTrue(condition);
    }
    @Test
    public void negativeValidateEmailTesting() {
        boolean condition=userRegister.checkEmailID("@gmail.co.in");
        Assert.assertFalse(condition);
    }

    @Test
    public void positiveValidateMobileTesting() {
        boolean condition=userRegister.validateMobile("07760987606");
        Assert.assertTrue(condition);
    }
    @Test
    public void negativeValidateMobileTesting() {
        boolean condition=userRegister.validateMobile("987606");
        Assert.assertFalse(condition);
    }

    @Test
    public void positiveValidatePassword() {
        boolean condition=userRegister.validatePassword("mil$anGowdasjs0");
        Assert.assertTrue(condition);
    }
    @Test
    public void negativeValidatePassword() {
        boolean condition=userRegister.validatePassword("milanGowdasjs0");
        Assert.assertFalse(condition);
    }

    @Before
    public void setUp() throws Exception {
        userRegister = new UserRegister();
    }
}
