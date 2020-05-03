package com.userRegister;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegisterTest {
    private String email;
    private boolean emailStatus;
    private UserRegister userRegister;

    public UserRegisterTest(String email, boolean emailStatus) {
        this.email = email;
        this.emailStatus=emailStatus;
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},
                                            {"abc.100@yahoo.com",true},{"abc111@abc.com",true},
                                            {"abc-100@abc.net",true},{"abc-100@abc.net",true} ,
                                            {"abc.100@abc.com.au",true},{"abc@1.com",true},
                                            {"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
                                            {"abc",false},{"abc@.com.my",false},
                                            {"abc123@gmail.a",false},{"abc123@.com",false},
                                             {"abc123@.comcom",false},{".abc@abc.com",false},
                                             {"abc()*@gmail.com",false},{"abc@%*.com",false},
                                            {"abc...2002@gmail.com",false},{"abc.gmail.com",false},
                                            {"abc.@abcgmail.com",false},{"abc@gmail.com.1a",false},
                                            {"abc@gmail.com.aa.au",false} });
    }

    @Test
    public void emailTesting() {
        boolean condition=userRegister.checkEmailID(email);
        System.out.println(condition+" and "+emailStatus);
        Assert.assertEquals(emailStatus,userRegister.checkEmailID(email));
    }

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
        boolean condition=userRegister.checkEmailID("milan.gowdadb@gmail.co.in");
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
        boolean condition=userRegister.validatePassword("milanGowdasj*(s0");
        Assert.assertFalse(condition);
    }

    @Before
    public void setUp() throws Exception {
        userRegister = new UserRegister();
    }
}
