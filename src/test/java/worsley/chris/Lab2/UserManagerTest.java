package worsley.chris.Lab2;

import org.junit.Assert;
import org.junit.Test;
import worsley.chris.ATM.Lab2.Enums;
import worsley.chris.ATM.Lab2.User;
import worsley.chris.ATM.Lab2.UserManager;

import java.util.HashMap;

/**
 * Created by christopherworsley on 9/18/16.
 */
public class UserManagerTest extends Enums {
    UserManager userManager = new UserManager();
    User user = new User();

    @Test
    public void userNameAndPasswordTest() {
        user.setUsername("Crank");
        user.setPassword("Coder");
        HashMap<String, String> testingUsernameAndPassword = new HashMap<String, String>();
        testingUsernameAndPassword.put(user.getUsername(), user.getPassword());
        userManager.setUserNameAndPassword("Crank", "Coder");
        HashMap<String, String> actual = userManager.getUserNameAndPassword();

        Assert.assertEquals("expecting Username Crank and Password Coder",testingUsernameAndPassword, actual);

    }
    @Test
    public void setOpenCloseFrozenTest(){
        userManager.setOpenCloseFrozen(AccountOpenCloseFrozen.OPEN);
        AccountOpenCloseFrozen expected = AccountOpenCloseFrozen.OPEN;
        AccountOpenCloseFrozen actual = userManager.getOpenCloseFrozen();
        Assert.assertEquals("Expecting account status to be Open", expected, actual);
    }
    @Test
    public void accountType(){
        userManager.setAccountType(AccountType.SAVING);
        AccountType expected = AccountType.SAVING;
        AccountType actual = userManager.getAccountType();
        Assert.assertEquals("Expecting Savings status", expected, actual);
    }

}
