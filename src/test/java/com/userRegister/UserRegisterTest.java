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
    public void secondNameTesting() {
        boolean condition=userRegister.checkSecondName("Gowda");
        Assert.assertTrue(condition);
    }

    @Before
    public void setUp() throws Exception {
        userRegister = new UserRegister();
    }
}