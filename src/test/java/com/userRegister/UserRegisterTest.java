package com.userRegister;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegisterTest {
private UserRegister userRegister;
    @Test
    public void firstNameTesting() {
    boolean condition=userRegister.checkFirstName("Milan");
        Assert.assertTrue(condition);
    }

    @Test
    public void lastNameTesting() {
        boolean condition=userRegister.checkLastName("Gowda");
        Assert.assertTrue(condition);
    }

    @Test
    public void validateEmailTesting() {
        boolean condition=userRegister.checkEmailID("milan.gowda.adb@gmail.co.in");
        Assert.assertTrue(condition);
    }

    @Test
    public void validateMobileTesting() {
    boolean condition=userRegister.validateMobile("07760987606");
    Assert.assertTrue(condition);
    }

    @Test
    public void validatePassword() {
    boolean condition=userRegister.validatePassword("milanGowdasjs0");
    Assert.assertTrue(condition);
    }

    @Before
    public void setUp() throws Exception {
        userRegister = new UserRegister();
    }
}
