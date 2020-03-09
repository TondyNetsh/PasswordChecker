import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PasswordTest{
    @Test
    public void isUpperCase(){
        Assert.assertEquals(PasswordChecker.upperCase, false);
    }
    @Test
    public void isLowerCase(){
        Assert.assertEquals(PasswordChecker.lowerCase, false);
    }
    @Test
    public void isDigit(){
        Assert.assertEquals(PasswordChecker.digitCheck, false);
    }
    @Test
    public void isSpecialChar(){
        Assert.assertEquals(PasswordChecker.oneSpecialChar, false);
    }
    @Test
    public void PasswordCheckerTest() throws PasswordException{
        assertTrue("Valid password: ",PasswordChecker.passwordIsOk("Rotondwa11!@"));
    }
}
